package lk.ijse.spring.service.impl;

import lk.ijse.spring.config.WebAppConfig;
import lk.ijse.spring.config.WebRootConfig;
import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.service.CustomerService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;


import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author ishanka on 6/9/21 at 8:03 PM
 * @since 0.0.1
 */
@Transactional // when in Test Class it do not write database, but check if data can store in DB
@WebAppConfiguration
@ContextConfiguration(classes = {WebAppConfig.class, WebRootConfig.class})
@ExtendWith(SpringExtension.class)
class CustomerServiceImplTest2 {

    @Autowired
    CustomerService service;

    @Test
    void addCustomer() {

        // we can use Assertions methods to check our methods are processing as we want or not
        // pass if error was thrown from the define Runtime Exception class by provider code
        Assertions.assertThrows(RuntimeException.class, () -> {
            service.addCustomer(new CustomerDTO("C001", "Kamal", "Galle", 20215));// Already exists customer
        });

//        Assertions.assertDoesNotThrow(()->{
//            service.addCustomer(new CustomerDTO("C005", "Kamal", "Galle", 20215));
//        });
    }

    @Test
    void testAddCustomer() {

        // check addCustomer method with duplicate details
        CustomerDTO c1 = new CustomerDTO("C001", "Yaka", "Galle", 20215);
        assertThrows(RuntimeException.class, () -> {
            service.addCustomer(c1);
        });

        //put valid data and check whether it is ok or not
        CustomerDTO c5 = new CustomerDTO("C005", "Yaka", "Galle", 20215);
        assertDoesNotThrow(() -> {
            service.addCustomer(c5);
        });
    }

    @Test
    void getAllMethod() {

        CustomerDTO c1 = new CustomerDTO("C001", "Yaka", "Galle", 20215);
        CustomerDTO c2 = new CustomerDTO("C002", "Malan", "Galle", 20215);
        CustomerDTO c3 = new CustomerDTO("C003", "Geetha", "Galle", 20215);
        service.addCustomer(c1);
        service.addCustomer(c2);
        service.addCustomer(c3);

        ArrayList<CustomerDTO> allCustomer = service.getAllCustomer();
        for (CustomerDTO customerDTO : allCustomer) {
            System.out.println(customerDTO.toString());
        }
    }
}