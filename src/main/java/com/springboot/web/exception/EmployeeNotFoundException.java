package com.springboot.web.exception;

import org.springframework.web.bind.annotation.RestControllerAdvice;


public class EmployeeNotFoundException extends RuntimeException
{
    public EmployeeNotFoundException(String msg)
    {
        super(msg);
    }
}
