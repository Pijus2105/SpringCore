package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Employee {
	
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/standaloneconfig.xml");
         EmployeeApp EP = ap.getBean("employeesName", EmployeeApp.class);
         System.out.println(EP);
	}
	
	
	        
}
