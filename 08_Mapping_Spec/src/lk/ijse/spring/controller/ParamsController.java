package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author ishanka on 5/30/21 at 8:08 PM
 * @since 0.0.1
 */
@RestController
@RequestMapping("/api/v1/param")
public class ParamsController {

    @GetMapping
    public String test1() {
        return "test 1";
    }

    // usage of parameters for request narrow downing
    @GetMapping(params = {"id","name"})
    public String test2(@RequestParam String id, @RequestParam String name) {
        System.out.println("id name");
        return id +" "+name;
    }

    @GetMapping(params = {"address","salary"})
    public String test3(@RequestParam("address") String myAddress,@RequestParam("salary") String mySalary) {
        System.out.println("address salary");
        return myAddress +" "+mySalary;
    }

    @GetMapping(params = {"id","name","address","salary"})
    public String test4(String id,  String name, String address, String salary) {
       return id+ " " +name+" "+address+" "+salary;
    }
}
