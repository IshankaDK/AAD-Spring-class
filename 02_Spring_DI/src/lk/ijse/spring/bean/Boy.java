package lk.ijse.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author ishanka on 4/13/21 at 1:24 AM
 * @since 0.0.1
 */
@Component
public class Boy /*implements DI */ {
    @Autowired
//    @Qualifier("girl1")
            SuperGirl girl; //property injection


    //    @Autowired // constructor injection
    public Boy(/*SuperGirl g*/) {
        System.out.println("Boy working");
//        this.girl = g;
    }

/*    @Autowired //setter method injection
    public void setGirl(SuperGirl g) {
        this.girl = g;
    }*/

    public void chatWithGirl() {
        girl.chat();
    }

//    @Autowired // interface through injection
//    @Override
//    public void inject(SuperGirl g) {
//        girl = g;
//    }
}