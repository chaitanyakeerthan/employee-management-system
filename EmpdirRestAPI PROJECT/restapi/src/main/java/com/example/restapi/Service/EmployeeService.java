package com.example.restapi.Service;

import com.example.restapi.Entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> findAll();
    Optional<Employee>  findById(Integer id);
    Employee save(Employee employee);
    Optional<Employee> updateById(Integer id ,Employee employee);
    Optional<Employee>  deleteById(Integer id) throws Exception;
}
