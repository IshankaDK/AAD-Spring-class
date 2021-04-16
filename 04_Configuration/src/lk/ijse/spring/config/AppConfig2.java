package lk.ijse.spring.config;

import lk.ijse.spring.bean.SpringBean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author ishanka on 4/16/21 at 10:53 PM
 * @since 0.0.1
 */
@Configuration
public class AppConfig2 {
    @Bean
    public SpringBean2 springBean2(){
        return new SpringBean2();
    }
}
