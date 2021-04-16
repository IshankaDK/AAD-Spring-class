package lk.ijse.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author ishanka on 4/12/21 at 10:14 PM
 * @since 0.0.1
 */
public class DBConnection/* implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean */{
    public DBConnection() {
        System.out.println("DBConnection Instantiated");
    }


}
