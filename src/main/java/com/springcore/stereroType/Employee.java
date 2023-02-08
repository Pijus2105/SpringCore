package com.springcore.stereroType;

public class Employee {
	
	private String employeeName;
	private String employeeCity;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String employeeName, String employeeCity) {
		super();
		this.employeeName = employeeName;
		this.employeeCity = employeeCity;
	}
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeCity=" + employeeCity + "]";
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeCity() {
		return employeeCity;
	}
	public void setEmployeeCity(String employeeCity) {
		this.employeeCity = employeeCity;
	}

}
