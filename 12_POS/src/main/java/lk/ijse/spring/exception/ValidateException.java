package lk.ijse.spring.exception;

/**
 * @author ishanka on 6/10/21 at 10:13 PM
 * @since 0.0.1
 */
public class ValidateException extends RuntimeException{
    public ValidateException(String message) {
        super(message);
    }
}
