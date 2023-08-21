package com.example.BootDemo.emp.bean;

import jakarta.persistence.*;

@Entity
@Table(name = "Emp")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long empId;
    public String empName;
    public double empSal;
    public String empCity;

    public Employee() {
    }

    public Employee(Long empId, String empName, Double empSal, String empCity) {
        this.empId = empId;
        this.empName = empName;
        this.empSal = empSal;
        this.empCity = empCity;
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Double getEmpSal() {
        return empSal;
    }

    public void setEmpSal(Double empSal) {
        this.empSal = empSal;
    }

    public String getEmpCity() {
        return empCity;
    }

    public void setEmpCity(String empCity) {
        this.empCity = empCity;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSal=" + empSal +
                ", empCity='" + empCity + '\'' +
                '}';
    }
}
