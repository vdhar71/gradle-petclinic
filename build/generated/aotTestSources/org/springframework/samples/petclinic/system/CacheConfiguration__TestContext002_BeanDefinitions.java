package org.springframework.samples.petclinic.system;

import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.autoconfigure.cache.JCacheManagerCustomizer;

/**
 * Bean definitions for {@link CacheConfiguration}.
 */
public class CacheConfiguration__TestContext002_BeanDefinitions {
  /**
   * Get the bean definition for 'cacheConfiguration'.
   */
  public static BeanDefinition getCacheConfigurationBeanDefinition() {
    Class<?> beanType = CacheConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(CacheConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'petclinicCacheConfigurationCustomizer'.
   */
  private static BeanInstanceSupplier<JCacheManagerCustomizer> getPetclinicCacheConfigurationCustomizerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<JCacheManagerCustomizer>forFactoryMethod(CacheConfiguration.class, "petclinicCacheConfigurationCustomizer")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(CacheConfiguration.class).petclinicCacheConfigurationCustomizer());
  }

  /**
   * Get the bean definition for 'petclinicCacheConfigurationCustomizer'.
   */
  public static BeanDefinition getPetclinicCacheConfigurationCustomizerBeanDefinition() {
    Class<?> beanType = JCacheManagerCustomizer.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getPetclinicCacheConfigurationCustomizerInstanceSupplier());
    return beanDefinition;
  }
}
