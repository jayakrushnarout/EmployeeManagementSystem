package com.springboot.web.service;

import com.springboot.web.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmpoyeeService
{
    public Employee save(Employee employee);
    public Employee getEmployeeById(Integer Id);
    public List<Employee> getAllEmployees();
    public String deltebyId(Integer id);

}
