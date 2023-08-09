pipeline {
    agent any
    // tools {
    //     jfrog 'jfrog-cli'
    // }
 
    environment {
        IMG_VER = 1
        dockerCredentials = 'dockerhub'
	GIT_REPO_NAME = 'gradle-petclinic'
	GIT_USER_NAME = 'vdhar71'
	gitcreds = 'github'
	GIT_URL = 'https://github.com/vdhar71/gradle-petclinic'
        PATH='/bin:/usr/bin:/usr/local/bin:/sbin:/usr/sbin'
    }

    stages {
        stage('Build') {
            steps {
		// Login to Docker to enable trivy to download the DB.
		sh 'echo $PATH'
                sh 'env'
		
                // Docker login to use trivy
                withCredentials([usernamePassword(credentialsId: dockerCredentials, passwordVariable: 'password', usernameVariable: 'username')]) {
                        sh '/usr/local/bin/docker login -u $username -p $password'
                }
                // Trivy scan before git checkout
                sh '/opt/homebrew/bin/trivy repo https://github.com/vdhar71/gradle-petclinic.git --scanners vuln,secret,config,license --dependency-tree'
                
                // Checkout spring-petclinic code from the GitHub repository
                checkout scmGit(branches: [
                    [name: '*/main']
                    ], 
                    extensions: [cleanBeforeCheckout(deleteUntrackedNestedRepositories: true)], 
                    userRemoteConfigs: [
                        [url: 'https://github.com/vdhar71/gradle-petclinic']
                        ])
                        
                // Exec JF & Gradle commands and build the app
                // jf '-v'
                // jf 'c show'
                // Check whether dependencies are pulled from JFrog Artifactory
                sh './gradlew dependencies'
                // Build petclinic app
                sh './gradlew build'
                
                // Trivy scan after app is built
                sh '/opt/homebrew/bin/trivy fs . --scanners vuln,secret,config,license --dependency-tree'
                
                // Publish the build info.
                // jf 'rt bp'

                
            }

            post {
                // If Gradle was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    archiveArtifacts 'build/libs//*.jar'
                    // Build the Docker image from the resulting jar
                    sh '/usr/local/bin/docker build -t vdhar/gradle-petclinic:${IMG_VER}.${BUILD_NUMBER} .'
                    
                    // Trivy scan on the final artifact: Docker image
                    sh '/opt/homebrew/bin/trivy image vdhar/gradle-petclinic:${IMG_VER}.${BUILD_NUMBER} --scanners vuln,secret,config,license --dependency-tree'
                    
                    // sh '/usr/local/bin/docker save -o gradle-petclinic.tar vdhar/gradle-petclinic:${IMG_VER}.${BUILD_NUMBER}'
                    // jf 'rt u gradle-petclinic.tar repo-local/'

                    sh '/usr/local/bin/docker push vdhar/gradle-petclinic:${IMG_VER}.${BUILD_NUMBER}'

		    // GitHub login to be able to push Kubernetes deployment manifests
		    withCredentials([usernamePassword(credentialsId: gitcreds, passwordVariable: 'password', usernameVariable: 'username')]) {
                    sh '''
                        git config user.email "vidash@yahoo.com"
                        git config user.name "Vidyadhar Chitradurga"

   			sed -r -i "s/replaceImageTag/${IMG_VER}.${BUILD_NUMBER}/g" k8s-argocd-manifests/deployment.yml
			git add k8s-argocd-manifests/deployment.yml
                        git commit -m "Update deployment image to version ${IMG_VER}.${BUILD_NUMBER}"
			git push https://${GITHUB_TOKEN}@github.com/${GIT_USER_NAME}/${GIT_REPO_NAME} HEAD:main
                        trivy k8s deployment/petclinic
                       '''
                    }
                }
            }
        }
    }
}
