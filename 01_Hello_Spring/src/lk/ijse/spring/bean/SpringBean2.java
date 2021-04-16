package lk.ijse.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SpringBean2 implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public SpringBean2() {
        System.out.println("Spring Bean 2 Instantiated");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Name Aware..!");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Factory Aware..!");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy..!");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initialize Bean..! ");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application Context Aware..!");
    }
}