package lk.ijse.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author ishanka on 4/16/21 at 11:21 PM
 * @since 0.0.1
 */
//@Component
public class SpringBean2 {
//    public SpringBean2() {
//        System.out.println("Spring Bean 2...!");
//    }
    public SpringBean2(@Value("C001") String id, @Value("Kasun,Danu,Kamla") String names[]) {
        System.out.println("Spring Bean 2...!");
        for (String name : names) {
            System.out.println(id + " " +name);
        }
    }
}
