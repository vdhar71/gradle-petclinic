package org.springframework.boot.actuate.autoconfigure.cache;

import java.lang.Class;
import java.util.Map;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.actuate.cache.CachesEndpoint;
import org.springframework.boot.actuate.cache.CachesEndpointWebExtension;

/**
 * Bean definitions for {@link CachesEndpointAutoConfiguration}.
 */
public class CachesEndpointAutoConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'cachesEndpointAutoConfiguration'.
   */
  public static BeanDefinition getCachesEndpointAutoConfigurationBeanDefinition() {
    Class<?> beanType = CachesEndpointAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(CachesEndpointAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'cachesEndpoint'.
   */
  private static BeanInstanceSupplier<CachesEndpoint> getCachesEndpointInstanceSupplier() {
    return BeanInstanceSupplier.<CachesEndpoint>forFactoryMethod(CachesEndpointAutoConfiguration.class, "cachesEndpoint", Map.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(CachesEndpointAutoConfiguration.class).cachesEndpoint(args.get(0)));
  }

  /**
   * Get the bean definition for 'cachesEndpoint'.
   */
  public static BeanDefinition getCachesEndpointBeanDefinition() {
    Class<?> beanType = CachesEndpoint.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getCachesEndpointInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'cachesEndpointWebExtension'.
   */
  private static BeanInstanceSupplier<CachesEndpointWebExtension> getCachesEndpointWebExtensionInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<CachesEndpointWebExtension>forFactoryMethod(CachesEndpointAutoConfiguration.class, "cachesEndpointWebExtension", CachesEndpoint.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(CachesEndpointAutoConfiguration.class).cachesEndpointWebExtension(args.get(0)));
  }

  /**
   * Get the bean definition for 'cachesEndpointWebExtension'.
   */
  public static BeanDefinition getCachesEndpointWebExtensionBeanDefinition() {
    Class<?> beanType = CachesEndpointWebExtension.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getCachesEndpointWebExtensionInstanceSupplier());
    return beanDefinition;
  }
}
