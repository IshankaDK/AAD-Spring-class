package lk.ijse.spring.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ishanka on 6/10/21 at 10:49 PM
 * @since 0.0.1
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class StandardResponse {
    private String code;
    private String message;
    private Object data;
}
