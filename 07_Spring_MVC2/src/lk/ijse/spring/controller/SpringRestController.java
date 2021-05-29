package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author ishanka on 5/30/21 at 12:28 AM
 * @since 0.0.1
 */
// return HTTP response (Representational State (REST))
@RestController
@RequestMapping("/api/v1/customer")
public class SpringRestController {

    //mapping methods
    @GetMapping
    public String test1() {
        return "Hello Spring GetMapping";
    }

    @PostMapping
    public String test2() {
        return "Hello Spring PostMapping";
    }

    @PutMapping
    public String test3() {
        return "Hello Spring PutMapping";
    }

    @DeleteMapping
    public String test4() {
        return "Hello Spring DeleteMapping";
    }

}
