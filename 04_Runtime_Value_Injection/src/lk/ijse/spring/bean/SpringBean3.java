package lk.ijse.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author ishanka on 4/17/21 at 8:09 PM
 * @since 0.0.1
 */
//@Component
public class SpringBean3 {
    //    public SpringBean3() {
//        System.out.println("Spring Bean 3.0 Instantiated");
//    }

    @Autowired(required = false)
    public SpringBean3(@Value("C001") String id, @Value("Kamal") String name) {
        System.out.println("Spring Bean 3.1 Instantiated");
    }

    @Autowired(required = false)
    public SpringBean3(@Value("C001") String id, @Value("Kamal") String name , @Value("20") int age) {
        System.out.println("Spring Bean 3.2 Instantiated");
    }
}
