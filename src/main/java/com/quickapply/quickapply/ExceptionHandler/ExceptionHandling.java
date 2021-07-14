package com.quickapply.quickapply.ExceptionHandler;

import com.quickapply.quickapply.models.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionHandling extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> handleException(Exception ex) {
        ErrorResponse val = ErrorResponse.builder().message(ex.getMessage()).status(false).build();
        return new ResponseEntity<>(val, HttpStatus.FORBIDDEN);
    }

}
