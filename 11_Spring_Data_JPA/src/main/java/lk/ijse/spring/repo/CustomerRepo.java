package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ishanka on 6/6/21 at 9:10 PM
 * @since 0.0.1
 */
public interface CustomerRepo  extends JpaRepository<Customer,String> {
}
