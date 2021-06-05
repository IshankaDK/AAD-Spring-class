package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * @author ishanka on 6/5/21 at 9:28 PM
 * @since 0.0.1
 */

//@PathVariable -- required
//@RequestParam - not required
//@ModelAttribute - not required
//@RequestBody - required

@RestController
@RequestMapping("/api/v1/test")
public class TestController {

    //json request body
    @PostMapping
    public String saveCustomer(@RequestBody CustomerDTO dto) {
        return dto.toString();
    }

    //json request array
    @PostMapping("/array")
    public String saveCustomer2(@RequestBody ArrayList<CustomerDTO> list) {
        return list.toString();
    }

    @GetMapping
    public CustomerDTO searchCustomer() {
        return new CustomerDTO("C001", "Sanu", "Panadura", 4512.00);
    }

    //query string or x-www-urlencoded type body
    @PostMapping("/model")
    public String searchCustomer2(@ModelAttribute CustomerDTO dto) {
        return dto.toString();
    }
}
