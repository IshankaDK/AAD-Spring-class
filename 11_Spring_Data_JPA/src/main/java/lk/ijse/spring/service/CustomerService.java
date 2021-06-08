package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDTO;

import java.util.ArrayList;

/**
 * @author ishanka on 6/7/21 at 12:06 AM
 * @since 0.0.1
 */
public interface CustomerService {
     boolean addCustomer(CustomerDTO dto);
     boolean deleteCustomer(String id);
     boolean updateCustomer(CustomerDTO dto);
     CustomerDTO searchCustomer(String id);
     ArrayList<CustomerDTO> getAllCustomer();
     CustomerDTO searchCustomerByName(String name);
     CustomerDTO searchCustomerByNameAndAddress(String name,String address);
     ArrayList<CustomerDTO> searchCustomerByNameAndAddressForList(String name,String address);

}
