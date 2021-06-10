package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.exception.NotFoundException;
import lk.ijse.spring.service.CustomerService;
import lk.ijse.spring.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * @author ishanka on 6/6/21 at 8:20 PM
 * @since 0.0.1
 */
@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

    @Autowired
    private CustomerService service;


    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity saveCustomer(@RequestBody CustomerDTO dto) {
        if (dto.getId().trim().length()<=0) {
            throw new NotFoundException("Customer Id can not be empty");
        }
        service.addCustomer(dto);
        return new ResponseEntity(new StandardResponse("200","Done",dto), HttpStatus.CREATED);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAllCustomers() {
        ArrayList<CustomerDTO> allCustomer = service.getAllCustomer();
        return new ResponseEntity(new StandardResponse("200","Done",allCustomer), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}" ,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity searchCustomer(@PathVariable String id) {
        CustomerDTO customerDTO = service.searchCustomer(id);
        return new ResponseEntity(new StandardResponse("200","Done",customerDTO), HttpStatus.OK);

    }

    @DeleteMapping(params = {"id"} , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity deleteCustomer(@RequestParam String id) {
         service.deleteCustomer(id);
        return new ResponseEntity(new StandardResponse("200","Done",null), HttpStatus.OK);

    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity updateCustomer(@RequestBody CustomerDTO dto) {
        if (dto.getId().trim().length()<=0) {
            throw new NotFoundException("Customer Id can not be empty : update");
        }
        service.updateCustomer(dto);
        return new ResponseEntity(new StandardResponse("200","Done",null), HttpStatus.OK);
    }

}
