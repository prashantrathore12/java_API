package com.details.EmpDetails.entities;

public class employee {
	private long empId;
	private String empName;
	private String empDept;
	

	public employee(long empId, String empName, String empDept) {
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	@Override
	public String toString() {
		return "employee [empId=" + empId + ", empName=" + empName + ", empDept=" + empDept + "]";
	}
	
}
