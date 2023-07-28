package org.springframework.boot.actuate.autoconfigure.metrics.cache;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CacheMetricsAutoConfiguration}.
 */
public class CacheMetricsAutoConfiguration__TestContext003_BeanDefinitions {
  /**
   * Get the bean definition for 'cacheMetricsAutoConfiguration'.
   */
  public static BeanDefinition getCacheMetricsAutoConfigurationBeanDefinition() {
    Class<?> beanType = CacheMetricsAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(CacheMetricsAutoConfiguration::new);
    return beanDefinition;
  }
}
