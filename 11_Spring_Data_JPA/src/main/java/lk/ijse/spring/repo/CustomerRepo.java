package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Customer;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.util.Streamable;

import java.util.List;
import java.util.Optional;

/**
 * @author ishanka on 6/6/21 at 9:10 PM
 * @since 0.0.1
 */
public interface CustomerRepo extends JpaRepository<Customer, String> {

    // Query Methods
//    Query Methods Subject KeyWords

//    find..by     ..
//    read..by      .
//    get..by       -- return Entity/Collection Type
//    query..by     .
//    search..by   ..
//    stream..by    - return Streamable

//    count..by - return Long
//    exists..by - return boolean
//    delete..by.remove..by - return void

    Customer findCustomerByName(String name);

    Optional<Customer> findCustomerByNameAndAddress(String name, String address);
//    Optional<Customer> findByNameAndAddress(String name, String address); // this also works

    List<Customer> readByNameAndAddress(String name, String address, Pageable p);

    Optional<Customer> getByName(String name);

    Optional<Customer> queryByName(String name);

    Optional<Customer> searchByName(String name);

    Streamable<Customer> streamByName(String name);

    Long countByName(String name);

    boolean existsByName(String name);

    void deleteByName(String name);

    // native sql
    @Query(value = "select * from Customer",nativeQuery = true)
    List<Customer> getMyCustomers();

    //JPQL
    @Query(value = "select c from Customer c")
    List<Customer> getMyCustomersUsingJPQL();

    //HQL
    @Query(value = "from Customer")
    List<Customer> getMyCustomersUsingHQL();


    // Parameters

    // Positional Parameters
    @Query(value = "select c from Customer c where c.id=?1 and c.address=?2")
    List<Customer> getMyCustomersUsingJPQLAndPositionalParameters(String id, String address);

    // Named Parameters
    @Query(value = "select c from Customer c where c.id=:id and c.address=:address")
    List<Customer> getMyCustomersUsingJPQLAndNamedParameters(@Param("id") String id, @Param("address") String address);

}
