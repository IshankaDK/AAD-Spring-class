package lk.ijse.spring.config;

import lk.ijse.spring.bean.DBConnection;
import lk.ijse.spring.bean.SpringBean1;
import lk.ijse.spring.bean.SpringBean2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.registerShutdownHook();
        ctx.refresh();
//        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("About to close");
//            }
//        }));

//        SpringBean1 bean1 = ctx.getBean(SpringBean1.class);
//        SpringBean1 bean2 = ctx.getBean(SpringBean1.class);
        SpringBean2 bean3 = (SpringBean2) ctx.getBean("springBean2");
        SpringBean2 bean31 = (SpringBean2) ctx.getBean("springBean2");

//        bean1.test();
//        System.out.println(bean1);
        System.out.println(bean3);
        System.out.println(bean31);
//        System.out.println(bean3);

//        DBConnection db1 = ctx.getBean(DBConnection.class);
//        DBConnection db2 = ctx.getBean(DBConnection.class);
//
//        System.out.println(db1);
//        System.out.println(db2);

    }
}
