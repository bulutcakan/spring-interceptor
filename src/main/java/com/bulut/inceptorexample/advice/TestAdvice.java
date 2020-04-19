package com.bulut.inceptorexample.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class TestAdvice {

    @ExceptionHandler
    public ResponseEntity handle(UnsupportedOperationException unsupportedOperationException) {
        return new ResponseEntity(unsupportedOperationException.getLocalizedMessage(), HttpStatus.BAD_REQUEST);
    }
}
