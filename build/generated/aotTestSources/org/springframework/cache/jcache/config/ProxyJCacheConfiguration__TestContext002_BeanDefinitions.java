package org.springframework.cache.jcache.config;

import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.cache.jcache.interceptor.BeanFactoryJCacheOperationSourceAdvisor;
import org.springframework.cache.jcache.interceptor.JCacheInterceptor;
import org.springframework.cache.jcache.interceptor.JCacheOperationSource;

/**
 * Bean definitions for {@link ProxyJCacheConfiguration}.
 */
public class ProxyJCacheConfiguration__TestContext002_BeanDefinitions {
  /**
   * Get the bean definition for 'proxyJCacheConfiguration'.
   */
  public static BeanDefinition getProxyJCacheConfigurationBeanDefinition() {
    Class<?> beanType = ProxyJCacheConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
    InstanceSupplier<ProxyJCacheConfiguration> instanceSupplier = InstanceSupplier.using(ProxyJCacheConfiguration::new);
    instanceSupplier = instanceSupplier.andThen(ProxyJCacheConfiguration__TestContext002_Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'org.springframework.cache.config.internalJCacheAdvisor'.
   */
  private static BeanInstanceSupplier<BeanFactoryJCacheOperationSourceAdvisor> getInternalJCacheAdvisorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<BeanFactoryJCacheOperationSourceAdvisor>forFactoryMethod(ProxyJCacheConfiguration.class, "cacheAdvisor", JCacheOperationSource.class, JCacheInterceptor.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(ProxyJCacheConfiguration.class).cacheAdvisor(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'internalJCacheAdvisor'.
   */
  public static BeanDefinition getInternalJCacheAdvisorBeanDefinition() {
    Class<?> beanType = BeanFactoryJCacheOperationSourceAdvisor.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
    beanDefinition.setInstanceSupplier(getInternalJCacheAdvisorInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'jCacheInterceptor'.
   */
  private static BeanInstanceSupplier<JCacheInterceptor> getJCacheInterceptorInstanceSupplier() {
    return BeanInstanceSupplier.<JCacheInterceptor>forFactoryMethod(ProxyJCacheConfiguration.class, "cacheInterceptor", JCacheOperationSource.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(ProxyJCacheConfiguration.class).cacheInterceptor(args.get(0)));
  }

  /**
   * Get the bean definition for 'jCacheInterceptor'.
   */
  public static BeanDefinition getJCacheInterceptorBeanDefinition() {
    Class<?> beanType = JCacheInterceptor.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
    beanDefinition.setInstanceSupplier(getJCacheInterceptorInstanceSupplier());
    return beanDefinition;
  }
}
