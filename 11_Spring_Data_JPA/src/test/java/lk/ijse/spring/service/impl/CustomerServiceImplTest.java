package lk.ijse.spring.service.impl;

import lk.ijse.spring.config.JPAConfig;
import lk.ijse.spring.config.WebAppConfig;
import lk.ijse.spring.config.WebRootConfig;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.repo.CustomerRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.util.Streamable;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author ishanka on 6/9/21 at 7:44 PM
 * @since 0.0.1
 */
@WebAppConfiguration
@ContextConfiguration(classes = {WebAppConfig.class , WebRootConfig.class})
@ExtendWith(SpringExtension.class)
class CustomerServiceImplTest {

    @Autowired
    CustomerRepo repo;

    @Test
    void  addCustomer(){
        repo.save(new Customer("C003","Upali","Galle",100));
    }

    @Test
    void getAllCustomer() {
//        PageRequest request = PageRequest.of(1, 2);
        PageRequest request = PageRequest.of(2, 2, Sort.by("id").descending());
        Page<Customer> all = repo.findAll(request);
        Assertions.assertNotNull(all);
        for (Customer customer : all) {
            System.out.println(customer.toString());
        }

    }

    @Test
    void nameAndAddress(){
        List<Customer> customers = repo.readByNameAndAddress("Kamal", "Galle", PageRequest.of(0, 5));
        for (Customer customer : customers) {
            System.out.println(customer.toString());
        }
    }

    @Test
    void testRepo(){
//        Optional<Customer> nimal = repo.getByName("Nimal");
//        System.out.println(nimal.get().toString());

//        Optional<Customer> nimal = repo.queryByName("Nimal");
//        System.out.println(nimal.get().toString());

//        Optional<Customer> nimal = repo.searchByName("Nimal");
//        System.out.println(nimal.get().toString());

//        Streamable<Customer> list = repo.streamByName("Nimal");
//        for (Customer nimal : list) {
//            System.out.println(nimal.toString());
//        }

//        Long kamal = repo.countByName("123");
//        System.out.println(kamal);

//        boolean nimalIsAvailable = repo.existsByName("Nimal");
//        System.out.println(nimalIsAvailable+"");

//        repo.deleteByName("Upali");

    }

    //sql
    @Test
    void nativeQueryTest(){
        List<Customer> myCustomers = repo.getMyCustomers();
        for (Customer customer : myCustomers) {
            System.out.println(customer.toString());
        }
    }

    //jpql
    @Test
    void nativeQueryTestWithJPQL(){
        List<Customer> myCustomers = repo.getMyCustomersUsingJPQL();
        for (Customer customer : myCustomers) {
            System.out.println(customer.toString());
        }
    }

    //hql
    @Test
    void nativeQueryTestWithHQL(){
        List<Customer> myCustomers = repo.getMyCustomersUsingHQL();
        for (Customer customer : myCustomers) {
            System.out.println(customer.toString());
        }
    }

    //jpql with parameters // positional parameters
    @Test
    void nativeQueryTestWithJPQLAndPositionalParameters(){
        List<Customer> customer = repo.getMyCustomersUsingJPQLAndPositionalParameters("C002", "Galle");
        for (Customer customer1 : customer) {
            System.out.println(customer1.toString());
        }
    }

    //jpql with parameters // named parameters
    @Test
    void nativeQueryTestWithJPQLAndNamedParameters(){
        List<Customer> customer = repo.getMyCustomersUsingJPQLAndNamedParameters("C005", "Galle");
        for (Customer customer1 : customer) {
            System.out.println(customer1.toString());
        }
    }
}