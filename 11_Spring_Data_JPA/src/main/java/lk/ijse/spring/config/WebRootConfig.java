package lk.ijse.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author ishanka on 6/6/21 at 8:14 PM
 * @since 0.0.1
 */
@Configuration
@Import({JPAConfig.class})
public class WebRootConfig {
}
