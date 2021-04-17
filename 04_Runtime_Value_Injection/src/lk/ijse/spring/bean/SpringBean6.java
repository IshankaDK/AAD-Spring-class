package lk.ijse.spring.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author ishanka on 4/17/21 at 8:09 PM
 * @since 0.0.1
 */
@Component
public class SpringBean6 implements InitializingBean {
//    property place holder ${}
    @Value("${java.vendor.url}")
    String url;
    @Value("${user.country}")
    String country;
    @Value("${user.db.name}")
    String osName;

    public SpringBean6() {
        System.out.println("Spring Bean 5.0 Instantiated");
//        System.out.println(user);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(url);
        System.out.println(country);
        System.out.println(osName);
    }
}
