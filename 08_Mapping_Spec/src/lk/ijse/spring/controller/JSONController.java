package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

/**
 * @author ishanka on 5/30/21 at 11:39 PM
 * @since 0.0.1
 */
@RestController
@RequestMapping("/api/v1/json")
public class JSONController {

    // if request owns JSON
    @PostMapping
    public String SaveCustomer(@RequestBody CustomerDTO dto) {
        return dto.toString();

    }

    @GetMapping
    public CustomerDTO getAllCustomer() {
        return new CustomerDTO("C001","Upul","gampaha","1455");
    }

    @GetMapping(path = "/int")
    public int getInt() {
        return 500;
    }

    @GetMapping(path = "/bool")
    public boolean getBoolean() {
        return false;
    }
}
