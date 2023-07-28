package org.springframework.samples.petclinic;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link MysqlTestApplication}.
 */
public class MysqlTestApplication__TestContext002_BeanDefinitions {
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
}
