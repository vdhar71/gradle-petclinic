package org.springframework.boot.autoconfigure.cache;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CacheProperties}.
 */
public class CacheProperties__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'cacheProperties'.
   */
  public static BeanDefinition getCachePropertiesBeanDefinition() {
    Class<?> beanType = CacheProperties.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(CacheProperties::new);
    return beanDefinition;
  }
}
