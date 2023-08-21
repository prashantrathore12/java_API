package com.SpringEmp.Employee.Repository;

import com.SpringEmp.Employee.bean.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
