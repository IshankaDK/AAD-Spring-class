package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ishanka on 6/10/21 at 7:43 PM
 * @since 0.0.1
 */
public interface ItemRepo extends JpaRepository<Item,String> {
}
