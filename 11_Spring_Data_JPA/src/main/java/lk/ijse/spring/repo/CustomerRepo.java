package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author ishanka on 6/6/21 at 9:10 PM
 * @since 0.0.1
 */
public interface CustomerRepo  extends JpaRepository<Customer,String> {

    // Query Methods
    Customer findCustomerByName(String name);
    Optional<Customer> findCustomerByNameAndAddress(String name, String address);
//    Optional<Customer> findByNameAndAddress(String name, String address); // this also works

    List<Customer> readByNameAndAddress(String name, String address);
}
