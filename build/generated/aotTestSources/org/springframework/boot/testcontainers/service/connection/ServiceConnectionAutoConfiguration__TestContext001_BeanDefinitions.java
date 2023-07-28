package org.springframework.boot.testcontainers.service.connection;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ServiceConnectionAutoConfiguration}.
 */
public class ServiceConnectionAutoConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'serviceConnectionAutoConfiguration'.
   */
  public static BeanDefinition getServiceConnectionAutoConfigurationBeanDefinition() {
    Class<?> beanType = ServiceConnectionAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(ServiceConnectionAutoConfiguration::new);
    return beanDefinition;
  }
}
