package com.springboot.web.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler
{
    @ExceptionHandler(EmployeeNotFoundException.class)
    public ResponseEntity<?> handler(EmployeeNotFoundException exception)
    {
        StatusMessage statusMessage=StatusMessage.builder().message(exception.getMessage()).code(HttpStatus.BAD_REQUEST.value()).build();
        return new ResponseEntity<>(statusMessage,HttpStatus.BAD_REQUEST);
    }
}
