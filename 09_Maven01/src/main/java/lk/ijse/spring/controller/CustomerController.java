package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * @author ishanka on 6/5/21 at 9:28 PM
 * @since 0.0.1
 */

@RestController
@RequestMapping("/api/v1/customer")
@CrossOrigin
public class CustomerController {

    // x-www-urlencoded
    @PostMapping
    public String saveCustomer1(CustomerDTO dto) {
        System.out.println("calling 1");
        return dto.toString();
    }

    //json
    @PostMapping("json")
    public String saveCustomer2(@RequestBody CustomerDTO dto) {
        System.out.println("calling 2");
        return dto.toString();
    }

}
