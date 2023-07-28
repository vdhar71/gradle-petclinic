package org.springframework.samples.petclinic;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link PetClinicApplication}.
 */
public class PetClinicApplication__TestContext007_BeanDefinitions {
  /**
   * Get the bean definition for 'petClinicApplication'.
   */
  public static BeanDefinition getPetClinicApplicationBeanDefinition() {
    Class<?> beanType = PetClinicApplication.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    ConfigurationClassUtils.initializeConfigurationClass(PetClinicApplication.class);
    beanDefinition.setInstanceSupplier(PetClinicApplication$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
