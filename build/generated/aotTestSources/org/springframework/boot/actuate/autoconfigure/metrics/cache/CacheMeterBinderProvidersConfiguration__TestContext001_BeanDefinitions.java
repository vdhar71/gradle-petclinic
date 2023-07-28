package org.springframework.boot.actuate.autoconfigure.metrics.cache;

import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.actuate.metrics.cache.CaffeineCacheMeterBinderProvider;
import org.springframework.boot.actuate.metrics.cache.JCacheCacheMeterBinderProvider;

/**
 * Bean definitions for {@link CacheMeterBinderProvidersConfiguration}.
 */
public class CacheMeterBinderProvidersConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'cacheMeterBinderProvidersConfiguration'.
   */
  public static BeanDefinition getCacheMeterBinderProvidersConfigurationBeanDefinition() {
    Class<?> beanType = CacheMeterBinderProvidersConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(CacheMeterBinderProvidersConfiguration::new);
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link CacheMeterBinderProvidersConfiguration.JCacheCacheMeterBinderProviderConfiguration}.
   */
  public static class JCacheCacheMeterBinderProviderConfiguration {
    /**
     * Get the bean definition for 'jCacheCacheMeterBinderProviderConfiguration'.
     */
    public static BeanDefinition getJCacheCacheMeterBinderProviderConfigurationBeanDefinition() {
      Class<?> beanType = CacheMeterBinderProvidersConfiguration.JCacheCacheMeterBinderProviderConfiguration.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(CacheMeterBinderProvidersConfiguration.JCacheCacheMeterBinderProviderConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'jCacheCacheMeterBinderProvider'.
     */
    private static BeanInstanceSupplier<JCacheCacheMeterBinderProvider> getJCacheCacheMeterBinderProviderInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<JCacheCacheMeterBinderProvider>forFactoryMethod(CacheMeterBinderProvidersConfiguration.JCacheCacheMeterBinderProviderConfiguration.class, "jCacheCacheMeterBinderProvider")
              .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(CacheMeterBinderProvidersConfiguration.JCacheCacheMeterBinderProviderConfiguration.class).jCacheCacheMeterBinderProvider());
    }

    /**
     * Get the bean definition for 'jCacheCacheMeterBinderProvider'.
     */
    public static BeanDefinition getJCacheCacheMeterBinderProviderBeanDefinition() {
      Class<?> beanType = JCacheCacheMeterBinderProvider.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getJCacheCacheMeterBinderProviderInstanceSupplier());
      return beanDefinition;
    }
  }

  /**
   * Bean definitions for {@link CacheMeterBinderProvidersConfiguration.CaffeineCacheMeterBinderProviderConfiguration}.
   */
  public static class CaffeineCacheMeterBinderProviderConfiguration {
    /**
     * Get the bean definition for 'caffeineCacheMeterBinderProviderConfiguration'.
     */
    public static BeanDefinition getCaffeineCacheMeterBinderProviderConfigurationBeanDefinition() {
      Class<?> beanType = CacheMeterBinderProvidersConfiguration.CaffeineCacheMeterBinderProviderConfiguration.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(CacheMeterBinderProvidersConfiguration.CaffeineCacheMeterBinderProviderConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'caffeineCacheMeterBinderProvider'.
     */
    private static BeanInstanceSupplier<CaffeineCacheMeterBinderProvider> getCaffeineCacheMeterBinderProviderInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<CaffeineCacheMeterBinderProvider>forFactoryMethod(CacheMeterBinderProvidersConfiguration.CaffeineCacheMeterBinderProviderConfiguration.class, "caffeineCacheMeterBinderProvider")
              .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(CacheMeterBinderProvidersConfiguration.CaffeineCacheMeterBinderProviderConfiguration.class).caffeineCacheMeterBinderProvider());
    }

    /**
     * Get the bean definition for 'caffeineCacheMeterBinderProvider'.
     */
    public static BeanDefinition getCaffeineCacheMeterBinderProviderBeanDefinition() {
      Class<?> beanType = CaffeineCacheMeterBinderProvider.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getCaffeineCacheMeterBinderProviderInstanceSupplier());
      return beanDefinition;
    }
  }
}
