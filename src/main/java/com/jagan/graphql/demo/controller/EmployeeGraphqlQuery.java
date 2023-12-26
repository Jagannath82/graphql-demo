package com.jagan.graphql.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
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

    @MutationMapping
    public Employee addEmployee(@Argument Employee employee){
        return employeeRepository.save(employee);
    }
}
