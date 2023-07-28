package org.springframework.boot.testcontainers.properties;

import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.test.context.DynamicPropertyRegistry;

/**
 * Bean definitions for {@link TestcontainersPropertySourceAutoConfiguration}.
 */
public class TestcontainersPropertySourceAutoConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'testcontainersPropertySourceAutoConfiguration'.
   */
  public static BeanDefinition getTestcontainersPropertySourceAutoConfigurationBeanDefinition() {
    Class<?> beanType = TestcontainersPropertySourceAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(TestcontainersPropertySourceAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'dynamicPropertyRegistry'.
   */
  private static BeanInstanceSupplier<DynamicPropertyRegistry> getDynamicPropertyRegistryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<DynamicPropertyRegistry>forFactoryMethod(TestcontainersPropertySourceAutoConfiguration.class, "dynamicPropertyRegistry", ConfigurableEnvironment.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(TestcontainersPropertySourceAutoConfiguration.class).dynamicPropertyRegistry(args.get(0)));
  }

  /**
   * Get the bean definition for 'dynamicPropertyRegistry'.
   */
  public static BeanDefinition getDynamicPropertyRegistryBeanDefinition() {
    Class<?> beanType = DynamicPropertyRegistry.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getDynamicPropertyRegistryInstanceSupplier());
    return beanDefinition;
  }
}
