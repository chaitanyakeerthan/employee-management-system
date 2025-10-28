package com.example.restapi.RestController;

import com.example.restapi.Entity.Employee;
import com.example.restapi.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.lang.model.util.Elements;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")

public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees/{employeeId}")
    public Optional<Employee>  getEmployee(@PathVariable Integer employeeId)
    {
        return employeeService.findById(employeeId);
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees()
    {
        return employeeService.findAll();
    }

    @PostMapping("/employees")
    public Employee createEmployee( @RequestBody Employee employee)
    {
    Employee db=employeeService.save(employee);
    return db;
    }

    @PutMapping("/employees/{employeeId}")
    public Optional<Employee> updateEmployee(@PathVariable Integer employeeId, @RequestBody Employee employee)
    {
        return employeeService.updateById(employeeId,employee);

    }

    @DeleteMapping("/employees/{employeeId}")
    public Optional<Employee> deleteEmployee(@PathVariable Integer employeeId) throws Exception {
         Optional<Employee> db=employeeService.findById(employeeId);
         if(db==null)
         {
             throw new RuntimeException("employee id not found");
         }
         else {
             employeeService.deleteById(employeeId);
         }
         return db;
    }


}
