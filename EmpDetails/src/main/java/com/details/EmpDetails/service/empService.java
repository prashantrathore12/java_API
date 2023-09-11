package com.details.EmpDetails.service;
import com.details.EmpDetails.entities.employee;
import java.util.List;

public interface empService {
	public List<employee> getEmployee();
	
	public employee getEmp(long empId);

	public employee addEmp(employee emp);

	public employee updateEmp(employee emp);

	public void deleteEmp(long l);
}
