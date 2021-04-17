package lk.ijse.spring.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @author ishanka on 4/17/21 at 8:09 PM
 * @since 0.0.1
 */
@Component
public class SpringBean6 implements InitializingBean {

    @Autowired
    Environment env;

    public SpringBean6() {
        System.out.println("Spring Bean 6.0 Instantiated");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
//        System.getenv();
        String user = env.getProperty("USER");
        System.out.println(user);

//        System.getProperties();
        String url = env.getProperty("java.vendor.url");
        System.out.println(url);

//        ResourceBundle
        String name = env.getProperty("user.db.name");
        System.out.println(name);

//        if we enter a invalid property key it returns a null
        String error = env.getProperty("user.names"); //invalid key
        System.out.println(error);//null

//        if we enter a invalid property key on  getRequiredProperty() it returns a exception
        String address = env.getRequiredProperty("user.address1"); //invalid key
        System.out.println(address);
    }
}
