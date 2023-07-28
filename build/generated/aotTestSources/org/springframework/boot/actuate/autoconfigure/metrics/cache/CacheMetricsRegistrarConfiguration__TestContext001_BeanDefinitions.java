package org.springframework.boot.actuate.autoconfigure.metrics.cache;

import io.micrometer.core.instrument.MeterRegistry;
import java.lang.Class;
import java.util.Collection;
import java.util.Map;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.actuate.metrics.cache.CacheMetricsRegistrar;

/**
 * Bean definitions for {@link CacheMetricsRegistrarConfiguration}.
 */
public class CacheMetricsRegistrarConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.springframework.boot.actuate.autoconfigure.metrics.cache.CacheMetricsRegistrarConfiguration'.
   */
  private static BeanInstanceSupplier<CacheMetricsRegistrarConfiguration> getCacheMetricsRegistrarConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<CacheMetricsRegistrarConfiguration>forConstructor(MeterRegistry.class, Collection.class, Map.class)
            .withGenerator((registeredBean, args) -> new CacheMetricsRegistrarConfiguration(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'cacheMetricsRegistrarConfiguration'.
   */
  public static BeanDefinition getCacheMetricsRegistrarConfigurationBeanDefinition() {
    Class<?> beanType = CacheMetricsRegistrarConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getCacheMetricsRegistrarConfigurationInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'cacheMetricsRegistrar'.
   */
  private static BeanInstanceSupplier<CacheMetricsRegistrar> getCacheMetricsRegistrarInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<CacheMetricsRegistrar>forFactoryMethod(CacheMetricsRegistrarConfiguration.class, "cacheMetricsRegistrar")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(CacheMetricsRegistrarConfiguration.class).cacheMetricsRegistrar());
  }

  /**
   * Get the bean definition for 'cacheMetricsRegistrar'.
   */
  public static BeanDefinition getCacheMetricsRegistrarBeanDefinition() {
    Class<?> beanType = CacheMetricsRegistrar.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getCacheMetricsRegistrarInstanceSupplier());
    return beanDefinition;
  }
}
