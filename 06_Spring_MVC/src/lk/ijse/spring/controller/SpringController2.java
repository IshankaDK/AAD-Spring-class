package lk.ijse.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author ishanka on 5/29/21 at 10:43 PM
 * @since 0.0.1
 */
@Controller
@RequestMapping("/item")
public class SpringController2 {

    @GetMapping
    public ModelAndView test(){
        return new ModelAndView("/item");
    }
}
