package org.springframework.samples.petclinic.system;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link CrashControllerIntegrationTests}.
 */
public class CrashControllerIntegrationTests__TestContext008_BeanDefinitions {
  /**
   * Bean definitions for {@link CrashControllerIntegrationTests.TestConfiguration}.
   */
  public static class TestConfiguration {
    /**
     * Get the bean definition for 'testConfiguration'.
     */
    public static BeanDefinition getTestConfigurationBeanDefinition() {
      Class<?> beanType = CrashControllerIntegrationTests.TestConfiguration.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      ConfigurationClassUtils.initializeConfigurationClass(CrashControllerIntegrationTests.TestConfiguration.class);
      beanDefinition.setInstanceSupplier(CrashControllerIntegrationTests$TestConfiguration$$SpringCGLIB$$0::new);
      return beanDefinition;
    }
  }
}
