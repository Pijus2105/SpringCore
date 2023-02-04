package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employees {
	
	private String employeesName;
	private List<String> employeesPhone;
	private Set<String> employeesAddress;
	private Map<String, String> employeesWork;
	
	@Override
	public String toString() {
		return "Employees [employeesName=" + employeesName + ", employeesPhone=" + employeesPhone
				+ ", employeesAddress=" + employeesAddress + ", employeesWork=" + employeesWork + "]";
	}
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employees(String employeesName, List<String> employeesPhone, Set<String> employeesAddress,
			Map<String, String> employeesWork) {
		super();
		this.employeesName = employeesName;
		this.employeesPhone = employeesPhone;
		this.employeesAddress = employeesAddress;
		this.employeesWork = employeesWork;
	}
	public String getEmployeesName() {
		return employeesName;
	}
	public void setEmployeesName(String employeesName) {
		this.employeesName = employeesName;
	}
	public List<String> getEmployeesPhone() {
		return employeesPhone;
	}
	public void setEmployeesPhone(List<String> employeesPhone) {
		this.employeesPhone = employeesPhone;
	}
	public Set<String> getEmployeesAddress() {
		return employeesAddress;
	}
	public void setEmployeesAddress(Set<String> employeesAddress) {
		this.employeesAddress = employeesAddress;
	}
	public Map<String, String> getEmployeesWork() {
		return employeesWork;
	}
	public void setEmployeesWork(Map<String, String> employeesWork) {
		this.employeesWork = employeesWork;
	}
	

}
