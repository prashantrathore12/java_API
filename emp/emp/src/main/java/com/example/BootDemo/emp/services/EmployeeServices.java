package com.example.BootDemo.emp.services;

import com.example.BootDemo.emp.bean.Employee;
import com.example.BootDemo.emp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServices {
    @Autowired
    public EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        employeeRepository.findAll().forEach(employees::add);
        return employees;
    }

    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employeeDetails) {
        Employee employee = employeeRepository.findById(id).orElse(null);
        if (employee != null) {
            employee.setEmpName(employeeDetails.getEmpName());
            employee.setEmpSal(employeeDetails.getEmpSal());
            employee.setEmpCity(employeeDetails.getEmpCity());
            return employeeRepository.save(employee);
        }
        return null;
    }

    public void deleteEmployee(@PathVariable Long id) {
        employeeRepository.deleteById(id);
    }
}
