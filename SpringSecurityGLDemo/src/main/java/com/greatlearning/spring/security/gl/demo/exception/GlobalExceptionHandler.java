package com.greatlearning.spring.security.gl.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleException(Exception e){
        return new ResponseEntity<>("Handled Error: "+e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
