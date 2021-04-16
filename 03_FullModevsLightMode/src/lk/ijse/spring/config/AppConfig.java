package lk.ijse.spring.config;

import lk.ijse.spring.bean.SpringBean2;
import lk.ijse.spring.bean.SpringBean3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author ishanka on 4/16/21 at 6:33 PM
 * @since 0.0.1
 */
@Configuration
@ComponentScan(basePackages = "lk.ijse.spring")
public class AppConfig {

    // Full Mode
//    @Bean
//    public SpringBean2 springBean2() {
//        return new SpringBean2();
//    }

//    Full Mode Further More

//    Satisfied Inter Bean Dependency
 /*   @Bean
    public SpringBean2 springBean2() {
//    Inter Bean Dependency Invocation
        SpringBean3 springBean3_1 = springBean3();
        SpringBean3 springBean3_2 = springBean3();
        System.out.println(springBean3_1);
        System.out.println(springBean3_2);
        return new SpringBean2();
    }

    @Bean
    public SpringBean3 springBean3() {
        return new SpringBean3();
    }*/

}
