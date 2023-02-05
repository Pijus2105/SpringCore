package com.springcore.constructorInjector;

public class Employees {
	
	private String employeeName;
	private int employeeId;
	private EmployeesWork employeesWork;
	
	
	


	public Employees(String employeeName, int employeeId, EmployeesWork employeesWork) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.employeesWork = employeesWork;
	}




	@Override
	public String toString() {
		return "Employees [employeeName=" + employeeName + ", employeeId=" + employeeId + ", employeesWork="
				+ employeesWork + "]";
	}

}
