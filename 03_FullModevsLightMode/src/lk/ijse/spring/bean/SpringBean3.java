package lk.ijse.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author ishanka on 4/16/21 at 6:35 PM
 * @since 0.0.1
 */
//@Component
public class SpringBean3 implements DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean {
    public SpringBean3() {
        System.out.println("Spring Bean 3 Instantiated...!");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("3Name Aware..!");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("3Factory Aware..!");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("3Destroy..!");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("3Initialize Bean..! ");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("3Application Context Aware..!");
    }
}
