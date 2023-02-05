package com.springcore.constructorInjector;

public class EmployeesWork {
	
	private String employeesWork;

	public EmployeesWork(String employeesWork) {
		super();
		this.employeesWork = employeesWork;
	}

	@Override
	public String toString() {
		return "EmployeesWork [employeesWork=" + employeesWork + "]";
	}

	

}
