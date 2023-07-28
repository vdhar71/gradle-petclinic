package org.springframework.samples.petclinic;

import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;
import org.springframework.core.ResolvableType;
import org.testcontainers.containers.MySQLContainer;

/**
 * Bean definitions for {@link MysqlTestApplication}.
 */
public class MysqlTestApplication__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'mysqlTestApplication'.
   */
  public static BeanDefinition getMysqlTestApplicationBeanDefinition() {
    Class<?> beanType = MysqlTestApplication.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    ConfigurationClassUtils.initializeConfigurationClass(MysqlTestApplication.class);
    beanDefinition.setInstanceSupplier(MysqlTestApplication$$SpringCGLIB$$0::new);
    return beanDefinition;
  }

  /**
   * Get the bean definition for 'container'.
   */
  public static BeanDefinition getContainerBeanDefinition() {
    ResolvableType beanType = ResolvableType.forClass(MySQLContainer.class);
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(BeanInstanceSupplier.<MySQLContainer>forFactoryMethod(MysqlTestApplication.class, "container").withGenerator(MysqlTestApplication::container));
    return beanDefinition;
  }
}
