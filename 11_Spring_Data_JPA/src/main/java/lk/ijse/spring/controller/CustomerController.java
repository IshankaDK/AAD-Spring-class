package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
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


    @PostMapping
    public boolean saveCustomer(@RequestBody CustomerDTO dto) {
        boolean b = service.addCustomer(dto);
        return b;
    }

    @GetMapping
    public ArrayList<CustomerDTO> getAllCustomers() {
        return service.getAllCustomer();
    }

    @GetMapping(path = "/{id}")
    public CustomerDTO searchCustomer(@PathVariable String id) {
        return service.searchCustomer(id);
    }

    @DeleteMapping(params = {"id"})
    public boolean deleteCustomer(@RequestParam String id) {
        return service.deleteCustomer(id);
    }

    @PutMapping
    public boolean updateCustomer(@RequestBody CustomerDTO dto) {
        return service.updateCustomer(dto);
    }

    @GetMapping(path = "name/{name}")
    public CustomerDTO searchCustomerByName(@PathVariable String name) {
        return service.searchCustomerByName(name);
    }

    @GetMapping(path = "nameAndAddress/{name}/{address}")
    public CustomerDTO searchCustomerByNameAndAddress(@PathVariable String name,@PathVariable String address) {
        return service.searchCustomerByNameAndAddress(name,address);
    }

    @GetMapping(path = "list/{name}/{address}")
    public ArrayList<CustomerDTO> searchCustomerByNameAndAddressForAList(@PathVariable String name,@PathVariable String address) {
        return service.searchCustomerByNameAndAddressForList(name,address);
    }
}
