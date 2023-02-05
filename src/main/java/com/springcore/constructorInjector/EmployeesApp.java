package com.springcore.constructorInjector;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeesApp {
	
	public static void main(String[] args) {
		
		
		ApplicationContext AP = new ClassPathXmlApplicationContext("com/springcore/constructorInjector/ciconfig.xml");
		
		Employees emp = (Employees) AP.getBean("Employees");
		
		System.out.println(emp);
		
	}
	
	

}
