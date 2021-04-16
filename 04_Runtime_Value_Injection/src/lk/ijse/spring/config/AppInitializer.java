package lk.ijse.spring.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
    }
}
