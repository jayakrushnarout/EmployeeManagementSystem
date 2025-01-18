package com.springboot.web.controller;

import com.springboot.web.model.Employee;
import com.springboot.web.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeeController
{
    @Autowired
    private EmployeeServiceImpl service;

    @PostMapping(value = "/create")
    public ResponseEntity<?> save(@RequestBody Employee employee)
    {
        Employee emp=service.save(employee);
        if(emp!=null)
        {
            return new ResponseEntity<>(emp, HttpStatus.CREATED);
        }
        else
        {
            return new ResponseEntity<String>("Enter valid Employee",HttpStatus.BAD_REQUEST);
        }

    }

    @GetMapping("/EmployeeById/{id}")
    public ResponseEntity<?> getEmployeeById(@PathVariable Integer id)
    {
        return new ResponseEntity<>(service.getEmployeeById(id),HttpStatus.OK);
    }
//employee/getAll
    @GetMapping("/getAll")
    public ResponseEntity<?> getAllEmployees() {
        return new ResponseEntity<>(service.getAllEmployees(),HttpStatus.OK);
    }

    @DeleteMapping("/deleteById/{id}")
    public ResponseEntity<?> deltebyId(@PathVariable Integer id) {

        return new ResponseEntity<>("deleted successfully",HttpStatus.OK);
    }
}
