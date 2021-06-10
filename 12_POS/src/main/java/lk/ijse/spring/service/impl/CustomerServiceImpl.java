package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.exception.NotFoundException;
import lk.ijse.spring.exception.ValidateException;
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
        if (repo.existsById(dto.getId())) {
            throw new ValidateException("Customer Already Exist");
        }
        repo.save(mapper.map(dto, Customer.class));
        return true;
    }

    @Override
    public boolean deleteCustomer(String id) {
        if (!repo.existsById(id)) {
            throw new ValidateException("Customer Not Exist");
        }
        repo.deleteById(id);
        return true;
    }

    @Override
    public boolean updateCustomer(CustomerDTO dto) {
        if (!repo.existsById(dto.getId())) {
            throw new ValidateException("Customer Not Exist");
        }
        repo.save(mapper.map(dto, Customer.class));
        return true;
    }

    @Override
    public CustomerDTO searchCustomer(String id) {
        if (!repo.existsById(id)) {
            throw new ValidateException("Customer Not Exist");
        }
        Optional<Customer> customer = repo.findById(id);
        if (customer.isPresent()) {
            return mapper.map(customer.get(), CustomerDTO.class);
        }
        return null;
    }

    @Override
    public ArrayList<CustomerDTO> getAllCustomer() {
        List<Customer> all = repo.findAll();
        return mapper.map(all, new TypeToken<ArrayList<CustomerDTO>>() {
        }.getType());

    }

}
