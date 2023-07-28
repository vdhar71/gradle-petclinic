package org.springframework.boot.test.autoconfigure.jdbc;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link TestDatabaseAutoConfiguration}.
 */
public class TestDatabaseAutoConfiguration__TestContext007_BeanDefinitions {
  /**
   * Get the bean definition for 'testDatabaseAutoConfiguration'.
   */
  public static BeanDefinition getTestDatabaseAutoConfigurationBeanDefinition() {
    Class<?> beanType = TestDatabaseAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(TestDatabaseAutoConfiguration::new);
    return beanDefinition;
  }
}
