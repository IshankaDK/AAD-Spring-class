package lk.ijse.spring.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author ishanka on 6/10/21 at 7:33 PM
 * @since 0.0.1
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data // for getter setter and toString
public class Item {
    @Id
    private String code;
    private String description;
    private int qty;
    private double price;
}
