package lk.ijse.spring.config;

import lk.ijse.spring.bean.SpringBean2;
import lk.ijse.spring.bean.SpringBean3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ishanka on 4/16/21 at 11:00 PM
 * @since 0.0.1
 */
@Configuration
public class AppConfig3 {
    @Bean
    public SpringBean3 springBean3(){
        return new SpringBean3();
    }
}
