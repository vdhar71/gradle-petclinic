package org.springframework.boot.autoconfigure.thymeleaf;

import java.lang.Class;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.thymeleaf.spring6.SpringTemplateEngine;

/**
 * Bean definitions for {@link TemplateEngineConfigurations}.
 */
public class TemplateEngineConfigurations__TestContext001_BeanDefinitions {
  /**
   * Bean definitions for {@link TemplateEngineConfigurations.DefaultTemplateEngineConfiguration}.
   */
  public static class DefaultTemplateEngineConfiguration {
    /**
     * Get the bean definition for 'defaultTemplateEngineConfiguration'.
     */
    public static BeanDefinition getDefaultTemplateEngineConfigurationBeanDefinition() {
      Class<?> beanType = TemplateEngineConfigurations.DefaultTemplateEngineConfiguration.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(TemplateEngineConfigurations.DefaultTemplateEngineConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'templateEngine'.
     */
    private static BeanInstanceSupplier<SpringTemplateEngine> getTemplateEngineInstanceSupplier() {
      return BeanInstanceSupplier.<SpringTemplateEngine>forFactoryMethod(TemplateEngineConfigurations.DefaultTemplateEngineConfiguration.class, "templateEngine", ThymeleafProperties.class, ObjectProvider.class, ObjectProvider.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(TemplateEngineConfigurations.DefaultTemplateEngineConfiguration.class).templateEngine(args.get(0), args.get(1), args.get(2)));
    }

    /**
     * Get the bean definition for 'templateEngine'.
     */
    public static BeanDefinition getTemplateEngineBeanDefinition() {
      Class<?> beanType = SpringTemplateEngine.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getTemplateEngineInstanceSupplier());
      return beanDefinition;
    }
  }
}
