package com.springboot.web.repository;

import com.springboot.web.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpoyeeRepository extends JpaRepository<Employee,Integer>
{

}
