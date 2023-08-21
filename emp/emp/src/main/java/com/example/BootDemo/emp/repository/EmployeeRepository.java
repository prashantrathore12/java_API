package com.example.BootDemo.emp.repository;

import com.example.BootDemo.emp.bean.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
