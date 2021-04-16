package lk.ijse.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringBean1 {
    public SpringBean1() {
        System.out.println("Spring Bean 1 Instantiated");
    }
    public void test(){
        System.out.println("this is test method");
    }


}