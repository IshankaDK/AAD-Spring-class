package lk.ijse.spring.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author ishanka on 4/13/21 at 1:24 AM
 * @since 0.0.1
 */
@Component
@Primary
public class Girl1 implements SuperGirl {
    public Girl1() {
        System.out.println("Girl1 Work");
    }

    @Override
    public void chat() {
        System.out.println("girl1 chatting");
    }

}
