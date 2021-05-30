package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author ishanka on 5/30/21 at 12:58 AM
 * @since 0.0.1
 */
@RestController
@RequestMapping("/api/v1/ambiguous")
public class AmbiguousMappingController {

    @PostMapping
    public String addCustomer(){
        return "Customer Added..!";
    }

    @DeleteMapping
    public String deleteCustomer(){
        return "Customer Deleted..!";
    }

    @PutMapping
    public String updateCustomer(){
        return "Customer Updated..!";
    }

    @GetMapping
    public String getAllCustomer(){
        return "Customers List..!";
    }

    //Ambiguous mapping -> narrow down using path segment
    @GetMapping(path ="/id") // path segment
    public String searchCustomer(){
        return "Customer Searched..!";
    }

}
