package com.example.BootDemo.emp.controller;

import com.example.BootDemo.emp.bean.Employee;
import com.example.BootDemo.emp.repository.EmployeeRepository;
import com.example.BootDemo.emp.services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    public EmployeeServices employeeServices;

    @RequestMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeServices.getAllEmployees();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/employees")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeServices.createEmployee(employee);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/employees/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employeeDetails) {
        return employeeServices.updateEmployee(id, employeeDetails);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/employees/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeServices.deleteEmployee(id);
    }

}


