package com.details.EmpDetails.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import com.details.EmpDetails.entities.employee;


//This the service class providing implementation
@Service
public class empServiceImplement implements empService {
	List<employee> emp;
	public empServiceImplement() {
		emp = new ArrayList<>();
		emp.add(new employee(110, "Ramesh", "HR"));
		emp.add(new employee(112, "Rajesh", "Admin"));
	}

//public empServiceImplement() {
//	emp = stream().of(
//			new employee(110, "Ramesh", "HR"),
//			new employee(112, "Rajesh", "Admin")
//	).collect(Collectors.toList());
//}


	//Implemented method from the empService class
	@Override
	public List<employee> getEmployee() {
		return emp;
	}

	//Implemented method from the empService class
	@Override
	public employee getEmp(long empId) {
	    return emp.stream()
	              .filter(e -> e.getEmpId() == empId)
	              .findFirst()
	              .orElse(null);
	}

	//Implemented method from the empService class
	@Override
	public employee addEmp(employee em) {
		emp.add(em);
		return em;
	}

	@Override
	public employee updateEmp(employee em) {
		emp.forEach(e ->{
			if(e.getEmpId() == em.getEmpId()){
				e.setEmpName(em.getEmpName());
				e.setEmpDept(em.getEmpDept());
			}
		});
		return em;
	}

	@Override
	public void deleteEmp(long l) {
		emp=emp.stream().filter(e -> e.getEmpId()!=l).collect(Collectors.toList());
	}
}