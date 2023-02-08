package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;


public class EmployeeApp {
	
	private List<String> employeeName;
	private Set<String> employessWork;
	private Map<String, Integer> employeesFSalary;
	Properties prop;
	public EmployeeApp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeApp(List<String> employeeName, Set<String> employessWork, Map<String, Integer> employeesFSalary,
			Properties prop) {
		super();
		this.employeeName = employeeName;
		this.employessWork = employessWork;
		this.employeesFSalary = employeesFSalary;
		this.prop = prop;
	}
	@Override
	public String toString() {
		return "EmployeeApp [employeeName=" + employeeName + ", employessWork=" + employessWork + ", employeesFSalary="
				+ employeesFSalary + ", prop=" + prop + "]";
	}
	public List<String> getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(List<String> employeeName) {
		this.employeeName = employeeName;
	}
	public Set<String> getEmployessWork() {
		return employessWork;
	}
	public void setEmployessWork(Set<String> employessWork) {
		this.employessWork = employessWork;
	}
	public Map<String, Integer> getEmployeesFSalary() {
		return employeesFSalary;
	}
	public void setEmployeesFSalary(Map<String, Integer> employeesFSalary) {
		this.employeesFSalary = employeesFSalary;
	}
	public Properties getProp() {
		return prop;
	}
	public void setProp(Properties prop) {
		this.prop = prop;
	}

	

}
