package com.details.EmpDetails.controller;

import java.util.List;

//import io.swagger.annotations.ApiOperation;
//import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.details.EmpDetails.entities.employee;
import com.details.EmpDetails.service.empService;

@RestController
@RequestMapping("/employeeApi")
public class empController {
	
	@Autowired
	private empService employeeService;

	//To get all the all employees details
	@GetMapping("/employee")
	public List<employee> getEmployee(){
		return this.employeeService.getEmployee();
	}

	//To get the specific employee details by their empID
	@GetMapping("/employee/{empId}")
	public employee getEmp(@PathVariable long empId) {
		return this.employeeService.getEmp(empId);
	}

	@PostMapping("/employee")
	public employee addEmp(@RequestBody employee emp){
		 return this.employeeService.addEmp(emp);
	}

	@PutMapping("/employee")
	public employee updateEmp(@RequestBody employee emp){
		return this.employeeService.updateEmp(emp);
	}

	@DeleteMapping("/employee/{empId}")
	public ResponseEntity<HttpStatus> deleteEmp(@PathVariable String empId){
		try{
			this.employeeService.deleteEmp(Long.parseLong(empId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e){
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}