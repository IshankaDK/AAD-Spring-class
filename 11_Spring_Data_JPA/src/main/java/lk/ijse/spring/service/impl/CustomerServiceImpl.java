package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
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

    @Autowired
    private ModelMapper mapper;

    public boolean addCustomer(CustomerDTO dto) {
//        ModelMapper mapper = new ModelMapper();

        if (repo.existsById(dto.getId())) {
           throw new RuntimeException("Customer Already Exist");
        }
        repo.save(mapper.map(dto, Customer.class));
        return true;
    }

    @Override
    public boolean deleteCustomer(String id) {
//        CustomerDTO dto = searchCustomer(id);
//        repo.delete( mapper.map(dto, Customer.class));
        repo.deleteById(id);
        return true;
    }

    @Override
    public boolean updateCustomer(CustomerDTO dto) {
        if (repo.existsById(dto.getId())) {
            repo.save( mapper.map(dto, Customer.class));
            return true;
        }
        return false;
    }

    @Override
    public CustomerDTO searchCustomer(String id) {
        Optional<Customer> customer = repo.findById(id);
        if (customer.isPresent()) {
            return mapper.map(customer.get(), CustomerDTO.class);
        }
        return null;
    }

    @Override
    public ArrayList<CustomerDTO> getAllCustomer() {
        List<Customer> all = repo.findAll();
        return mapper.map(all, new TypeToken<ArrayList<CustomerDTO>>() {}.getType());

    }

    @Override
    public CustomerDTO searchCustomerByName(String name) {
        Customer customer = repo.findCustomerByName(name);
        return mapper.map(customer, CustomerDTO.class);
    }

    @Override
    public CustomerDTO searchCustomerByNameAndAddress(String name, String address) {
        Optional<Customer> customer = repo.findCustomerByNameAndAddress(name, address);
        if (customer.isPresent()) {
            return mapper.map(customer.get(), CustomerDTO.class);
        }
        return null;
    }

    @Override
    public ArrayList<CustomerDTO> searchCustomerByNameAndAddressForList(String name, String address) {
        List<Customer> customers = repo.readByNameAndAddress(name, address, PageRequest.of(0,2));
        return mapper.map(customers, new TypeToken<ArrayList<CustomerDTO>>() {}.getType());
    }

}
