package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author ishanka on 5/30/21 at 12:58 AM
 * @since 0.0.1
 */
@RestController
@RequestMapping("/api/v1/path")
public class PathSegmentController {

    //character mapping -  can match one character in a path segment
    @GetMapping(path = "/c??1")
    public String addItem1() {
        return "Item 1 Get..!";
    }

    @GetMapping(path = "/c?2")
    public String addItem2() {
        return "Item 2 Get..!";
    }

    //wild card
    //Match one or more characters within a path segment
    @GetMapping(path = "/c/*/123")
    public String addItem3() {
        return "Item 3 Get..!";
    }

    //Match 0 or more path segments until the end of the path
    // c/abcd/defg/hijk/555
    @GetMapping(path = "/c/**/555")
    public String addItem4() {
        return "Item 4 Get..!";
    }


}
