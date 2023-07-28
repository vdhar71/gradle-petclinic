package org.springframework.samples.petclinic.system;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CrashController}.
 */
public class CrashController__TestContext002_BeanDefinitions {
  /**
   * Get the bean definition for 'crashController'.
   */
  public static BeanDefinition getCrashControllerBeanDefinition() {
    Class<?> beanType = CrashController.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(CrashController::new);
    return beanDefinition;
  }
}
