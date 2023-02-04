package com.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class referenceApp {
	
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("com/springcore/reference/refconfig.xml");
		
		Company com = (Company) ap.getBean("Company");
		
		 System.out.println(com.getTeam());
		 System.out.println(com.getDesignation());
		
	}
	
	

}
