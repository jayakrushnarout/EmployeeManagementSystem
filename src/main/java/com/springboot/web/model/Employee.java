package com.springboot.web.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee
{
    private Integer empId;
    private String name;
    private Double salary;
    private String doj;
    private String experience;
    private String specialization;
}
