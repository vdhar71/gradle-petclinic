package org.springframework.samples.petclinic.owner;

import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link PetController}.
 */
public class PetController__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'petController'.
   */
  private static BeanInstanceSupplier<PetController> getPetControllerInstanceSupplier() {
    return BeanInstanceSupplier.<PetController>forConstructor(OwnerRepository.class)
            .withGenerator((registeredBean, args) -> new PetController(args.get(0)));
  }

  /**
   * Get the bean definition for 'petController'.
   */
  public static BeanDefinition getPetControllerBeanDefinition() {
    Class<?> beanType = PetController.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getPetControllerInstanceSupplier());
    return beanDefinition;
  }
}
