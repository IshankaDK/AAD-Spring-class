package lk.ijse.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author ishanka on 4/16/21 at 11:19 PM
 * @since 0.0.1
 */
@Configuration
@ComponentScan(basePackages = "lk.ijse.spring")
@PropertySource("classpath:application.properties")
public class AppConfig {
}
