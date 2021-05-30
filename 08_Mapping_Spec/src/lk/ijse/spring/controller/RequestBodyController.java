package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ishanka on 5/30/21 at 10:58 PM
 * @since 0.0.1
 */
@RestController
@RequestMapping("/api/v1/request")
public class RequestBodyController {
    // query string id,name = yes
    // x-www-form-urlencoded = no
    @GetMapping
    public String test1(String id, String name) {
        return id + " " + name;
    }

   /* @GetMapping
    public String test1(HttpServletRequest request) {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        return id + " " + name;
    }*/

    // x-www-form-urlencoded (id,name,address,salary) = yes
    // query string id,name = yes
    @PostMapping
    public String test2(String id, String name, String address, String salary) {
        return id + " " + name + " " + address + " " + salary;
    }

/*
    // Model Attribute
    @PostMapping
    public String test3(@ModelAttribute CustomerDTO dto) {
        return dto.toString();
    }*/

}
