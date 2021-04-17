package lk.ijse.spring.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;
import java.util.Properties;

/**
 * @author ishanka on 4/16/21 at 11:19 PM
 * @since 0.0.1
 */
public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();
// how to get system env predefined variables
//        Map<String, String> env = System.getenv();
//        for (String key : env.keySet()) {
//            String val = env.get(key);
//            System.out.println(key + " : "+val);
//        }


//        how to get properties from java
//        Properties properties = System.getProperties();
//        for (Object key : properties.keySet()) {
//            Object val = properties.get(key);
//            System.out.println(key+" : "+val);
//        }
    }
}
