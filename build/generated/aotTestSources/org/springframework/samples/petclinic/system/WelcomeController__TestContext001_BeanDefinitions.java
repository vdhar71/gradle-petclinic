package org.springframework.samples.petclinic.system;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link WelcomeController}.
 */
public class WelcomeController__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'welcomeController'.
   */
  public static BeanDefinition getWelcomeControllerBeanDefinition() {
    Class<?> beanType = WelcomeController.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(WelcomeController::new);
    return beanDefinition;
  }
}
