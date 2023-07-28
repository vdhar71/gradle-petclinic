package org.springframework.boot.test.web.client;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link TestRestTemplateContextCustomizer}.
 */
public class TestRestTemplateContextCustomizer__TestContext008_BeanDefinitions {
  /**
   * Bean definitions for {@link TestRestTemplateContextCustomizer.TestRestTemplateRegistrar}.
   */
  public static class TestRestTemplateRegistrar {
    /**
     * Get the bean definition for 'testRestTemplateRegistrar'.
     */
    public static BeanDefinition getTestRestTemplateRegistrarBeanDefinition() {
      Class<?> beanType = TestRestTemplateContextCustomizer.TestRestTemplateRegistrar.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
      beanDefinition.setInstanceSupplier(TestRestTemplateContextCustomizer.TestRestTemplateRegistrar::new);
      return beanDefinition;
    }
  }

  /**
   * Bean definitions for {@link TestRestTemplateContextCustomizer.TestRestTemplateFactory}.
   */
  public static class TestRestTemplateFactory {
    /**
     * Get the bean definition for 'testRestTemplate'.
     */
    public static BeanDefinition getTestRestTemplateBeanDefinition() {
      Class<?> beanType = TestRestTemplateContextCustomizer.TestRestTemplateFactory.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(TestRestTemplateContextCustomizer.TestRestTemplateFactory::new);
      return beanDefinition;
    }
  }
}
