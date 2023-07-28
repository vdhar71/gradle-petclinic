package org.springframework.boot.sql.init.dependency;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link DatabaseInitializationDependencyConfigurer}.
 */
public class DatabaseInitializationDependencyConfigurer__TestContext008_BeanDefinitions {
  /**
   * Bean definitions for {@link DatabaseInitializationDependencyConfigurer.DependsOnDatabaseInitializationPostProcessor}.
   */
  public static class DependsOnDatabaseInitializationPostProcessor {
    /**
     * Get the bean definition for 'dependsOnDatabaseInitializationPostProcessor'.
     */
    public static BeanDefinition getDependsOnDatabaseInitializationPostProcessorBeanDefinition() {
      Class<?> beanType = DatabaseInitializationDependencyConfigurer.DependsOnDatabaseInitializationPostProcessor.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(DatabaseInitializationDependencyConfigurer.DependsOnDatabaseInitializationPostProcessor::new);
      return beanDefinition;
    }
  }
}
