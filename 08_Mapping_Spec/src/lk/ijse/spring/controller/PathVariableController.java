package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ishanka on 5/30/21 at 7:41 PM
 * @since 0.0.1
 */
@RestController
@RequestMapping("/api/v1/map")
public class PathVariableController {

    @GetMapping
    public String test1() {
        return "test 1";
    }

    //path variable
    @GetMapping(path = "/get/{id}")
    public String test2(@PathVariable String id) {
        return id;
    }

    @GetMapping(path = "/set/{name}/{address}")
    public String test3(@PathVariable String name, @PathVariable String address) {
        return name+ " "+ address;
    }

    //Path variable can be validate using Reg-ex
    @GetMapping(path = "/find/{id:C[0-9]{3}}/{name:[A-z]{1,5}}")
    public String test4(@PathVariable String id,@PathVariable String name) {
        return id+" "+name;
    }


    // setting allies for path variable
    @GetMapping(path = "/ex/{id}/{name}")
    public String test5(@PathVariable("id") String myId, @PathVariable("name") String myName) {
        return myId+" "+myName;
    }

}


