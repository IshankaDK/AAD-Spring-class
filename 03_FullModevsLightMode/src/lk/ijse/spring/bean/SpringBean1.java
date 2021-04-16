package lk.ijse.spring.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author ishanka on 4/16/21 at 6:35 PM
 * @since 0.0.1
 */
@Component
public class SpringBean1 {
    public SpringBean1() {
        System.out.println("Spring Bean 1 Instantiated...!");
    }

    // Light Mode
//    @Bean
//    public SpringBean2 springBean2() {
//        return new SpringBean2();
//    }


    // Light Mode Further More
//    Not Satisfied Inter Bean Dependency
    @Bean
    public SpringBean2 springBean2() {
        SpringBean3 springBean3_1 = springBean3();
        SpringBean3 springBean3_2 = springBean3();
        System.out.println(springBean3_1);
        System.out.println(springBean3_2);
        return new SpringBean2();
    }

    @Bean
    public SpringBean3 springBean3() {
        return new SpringBean3();
    }
}
