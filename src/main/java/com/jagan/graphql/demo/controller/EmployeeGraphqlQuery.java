package com.jagan.graphql.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.jagan.graphql.demo.model.Employee;
import com.jagan.graphql.demo.repository.EmployeeRepository;


@Controller
public class EmployeeGraphqlQuery {

    @Autowired
    EmployeeRepository employeeRepository;
    
    @QueryMapping
    public Iterable<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
}
