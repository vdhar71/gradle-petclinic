package org.springframework.boot.test.autoconfigure.orm.jpa;

import jakarta.persistence.EntityManagerFactory;
import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link TestEntityManagerAutoConfiguration}.
 */
public class TestEntityManagerAutoConfiguration__TestContext007_BeanDefinitions {
  /**
   * Get the bean definition for 'testEntityManagerAutoConfiguration'.
   */
  public static BeanDefinition getTestEntityManagerAutoConfigurationBeanDefinition() {
    Class<?> beanType = TestEntityManagerAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(TestEntityManagerAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'testEntityManager'.
   */
  private static BeanInstanceSupplier<TestEntityManager> getTestEntityManagerInstanceSupplier() {
    return BeanInstanceSupplier.<TestEntityManager>forFactoryMethod(TestEntityManagerAutoConfiguration.class, "testEntityManager", EntityManagerFactory.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(TestEntityManagerAutoConfiguration.class).testEntityManager(args.get(0)));
  }

  /**
   * Get the bean definition for 'testEntityManager'.
   */
  public static BeanDefinition getTestEntityManagerBeanDefinition() {
    Class<?> beanType = TestEntityManager.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getTestEntityManagerInstanceSupplier());
    return beanDefinition;
  }
}
