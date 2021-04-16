package lk.ijse.spring.config;

import lk.ijse.spring.bean.SpringBean2;
import org.springframework.context.annotation.*;

/**
 * @author ishanka on 4/16/21 at 11:00 PM
 * @since 0.0.1
 */
@Configuration
@ComponentScan(basePackages = "lk.ijse.spring")
//@Import({AppConfig2.class,AppConfig3.class}) // selecting main configuration class and import other configuration to it
//@ImportResource("classpath:abc.xml")
//@ImportResource({"classpath:abc.xml","classpath:xyz.xml"})
//@ImportResource("filepath:absolute-path.xml")
public class AppConfig1 {


}
