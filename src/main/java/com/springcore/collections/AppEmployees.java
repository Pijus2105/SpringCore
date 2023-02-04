package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppEmployees {

	public static void main(String[] args) {
		

		ApplicationContext AP = new ClassPathXmlApplicationContext("com/springcore/collections/collectionsconfig.xml");
		
		Employees emp = (Employees) AP.getBean("Employees");
		
		System.out.println(emp.getEmployeesName());
		System.out.println(emp.getEmployeesPhone());
		System.out.println(emp.getEmployeesAddress());
		System.out.println(emp.getEmployeesWork());
		

	}

}
