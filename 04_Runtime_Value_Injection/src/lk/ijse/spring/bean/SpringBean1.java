package lk.ijse.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author ishanka on 4/16/21 at 11:21 PM
 * @since 0.0.1
 */
//@Component
public class SpringBean1 {
//    public SpringBean1() {
//        System.out.println("Default Constructor...!");
//    }

    public SpringBean1(@Value("C001") String id, @Value("Kamal") String name,@Value("40") int age) {
        System.out.println("Spring Bean 1...!");
        System.out.println(id+" "+name+" "+age);
    }
}
