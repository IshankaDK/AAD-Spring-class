package lk.ijse.spring.exception;

/**
 * @author ishanka on 6/10/21 at 9:06 PM
 * @since 0.0.1
 */
public class NotFoundException extends RuntimeException{

    public NotFoundException(String message) {
    super(message);
    }
}
