package com.springcore.annotationAutowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiringApp {
	
	public static void main (String[] args) {
		
		ApplicationContext AP =new ClassPathXmlApplicationContext("com/springcore/annotationAutowire/AnnotationAutoconfig.xml");
		
		Employee emp = AP.getBean("Employee", Employee.class);
		
		System.out.println(emp);
		
	}

}
