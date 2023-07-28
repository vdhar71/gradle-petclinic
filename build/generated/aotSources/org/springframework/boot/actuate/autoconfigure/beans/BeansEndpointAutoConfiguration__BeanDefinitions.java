package org.springframework.boot.actuate.autoconfigure.beans;

import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.actuate.beans.BeansEndpoint;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Bean definitions for {@link BeansEndpointAutoConfiguration}.
 */
public class BeansEndpointAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'beansEndpointAutoConfiguration'.
   */
  public static BeanDefinition getBeansEndpointAutoConfigurationBeanDefinition() {
    Class<?> beanType = BeansEndpointAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(BeansEndpointAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'beansEndpoint'.
   */
  private static BeanInstanceSupplier<BeansEndpoint> getBeansEndpointInstanceSupplier() {
    return BeanInstanceSupplier.<BeansEndpoint>forFactoryMethod(BeansEndpointAutoConfiguration.class, "beansEndpoint", ConfigurableApplicationContext.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(BeansEndpointAutoConfiguration.class).beansEndpoint(args.get(0)));
  }

  /**
   * Get the bean definition for 'beansEndpoint'.
   */
  public static BeanDefinition getBeansEndpointBeanDefinition() {
    Class<?> beanType = BeansEndpoint.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getBeansEndpointInstanceSupplier());
    return beanDefinition;
  }
}
