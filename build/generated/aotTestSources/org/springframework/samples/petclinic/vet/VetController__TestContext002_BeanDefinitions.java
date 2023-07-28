package org.springframework.samples.petclinic.vet;

import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link VetController}.
 */
public class VetController__TestContext002_BeanDefinitions {
  /**
   * Get the bean instance supplier for 'vetController'.
   */
  private static BeanInstanceSupplier<VetController> getVetControllerInstanceSupplier() {
    return BeanInstanceSupplier.<VetController>forConstructor(VetRepository.class)
            .withGenerator((registeredBean, args) -> new VetController(args.get(0)));
  }

  /**
   * Get the bean definition for 'vetController'.
   */
  public static BeanDefinition getVetControllerBeanDefinition() {
    Class<?> beanType = VetController.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getVetControllerInstanceSupplier());
    return beanDefinition;
  }
}
