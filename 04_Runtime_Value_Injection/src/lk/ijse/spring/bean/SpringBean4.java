package lk.ijse.spring.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author ishanka on 4/17/21 at 8:09 PM
 * @since 0.0.1
 */
//@Component
public class SpringBean4 implements InitializingBean {
    @Value("Kasun")
    String name;

    public SpringBean4() {
        System.out.println("Spring Bean 4.0 Instantiated");
        System.out.println(name);
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(name);
    }
}
