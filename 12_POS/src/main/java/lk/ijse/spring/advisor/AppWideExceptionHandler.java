package lk.ijse.spring.advisor;

import lk.ijse.spring.exception.NotFoundException;
import lk.ijse.spring.exception.ValidateException;
import lk.ijse.spring.util.StandardResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author ishanka on 6/10/21 at 8:44 PM
 * @since 0.0.1
 */
@RestControllerAdvice
@CrossOrigin
public class AppWideExceptionHandler {

   /* @ExceptionHandler(Exception.class)
    String handlerException(Exception e){
        return e.getMessage();
    }*/

   /* @ExceptionHandler(Exception.class)
    ResponseEntity handlerException(Exception e){
        return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
    }*/


    @ExceptionHandler(Exception.class)
    ResponseEntity handlerException(Exception e) {
        return new ResponseEntity(new ResponseEntity(new StandardResponse("500","Error",e.getMessage()), HttpStatus.OK), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(NotFoundException.class)
    ResponseEntity handlerNotFoundException(Exception e) {
        return new ResponseEntity(new StandardResponse("404","Error",e.getMessage()), HttpStatus.NOT_FOUND);
    }

  @ExceptionHandler(ValidateException.class)
    ResponseEntity handlerValidateException(Exception e) {
        return new ResponseEntity(new StandardResponse("400","Error",e.getMessage()), HttpStatus.BAD_REQUEST);
    }

}
