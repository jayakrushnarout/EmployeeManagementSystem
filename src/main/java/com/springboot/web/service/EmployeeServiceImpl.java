package com.springboot.web.service;

import com.springboot.web.exception.EmployeeNotFoundException;
import com.springboot.web.model.Employee;
import com.springboot.web.repository.EmpoyeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmpoyeeService
{
    @Autowired
    private EmpoyeeRepository repo;
    @Override
    @Transactional
    public Employee save(Employee employee) {
        return repo.save(employee);
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        return repo.findById(id).orElseThrow(() -> new EmployeeNotFoundException("Please Enter valid Employee id"));
    }

    @Override
    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }

    @Override
    @Transactional
    public String deltebyId(Integer id) {
        repo.deleteById(id);
        return "deleted successfully";
    }
}
