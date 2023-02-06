package com.springcore.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiringApp {
	
	public static void main (String[] args) {
		
		ApplicationContext AP =new ClassPathXmlApplicationContext("com/springcore/autowiring/Autoconfig.xml");
		
		Employee emp = AP.getBean("Employee", Employee.class);
		
		System.out.println(emp);
		
	}

}
