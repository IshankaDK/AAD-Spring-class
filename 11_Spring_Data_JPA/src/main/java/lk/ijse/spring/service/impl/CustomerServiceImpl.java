package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author ishanka on 6/6/21 at 11:51 PM
 * @since 0.0.1
 */
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepo repo;

    public boolean addCustomer(CustomerDTO dto) {
        repo.save(new Customer(dto.getId(), dto.getName(), dto.getAddress(), dto.getSalary()));
        return true;
    }

    @Override
    public boolean deleteCustomer(String id) {
        CustomerDTO dto = searchCustomer(id);
        Customer customer = new Customer(dto.getId(), dto.getName(), dto.getAddress(), dto.getSalary());
        repo.delete(customer);
        return true;
    }

    @Override
    public boolean updateCustomer(CustomerDTO dto) {
       if (repo.existsById(dto.getId())){
           repo.save(new Customer(dto.getId(),dto.getName(),dto.getAddress(),dto.getSalary()));
           return true;
       }
       return false;
    }

    @Override
    public CustomerDTO searchCustomer(String id) {
        Optional<Customer> customer = repo.findById(id);
        if (customer.isPresent()) {
            Customer c = customer.get();
            return new CustomerDTO(c.getId(), c.getName(), c.getAddress(), c.getSalary());
        }
        return null;
    }

    @Override
    public ArrayList<CustomerDTO> getAllCustomer() {
        ArrayList<CustomerDTO> allCustomers = new ArrayList<>();
        List<Customer> all = repo.findAll();
        for (Customer c : all) {
            allCustomers.add(new CustomerDTO(c.getId(), c.getName(), c.getAddress(), c.getSalary()));
        }
        return allCustomers;
    }
}
