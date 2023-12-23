package com.jagan.graphql.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.jagan.graphql.demo.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
    
}
