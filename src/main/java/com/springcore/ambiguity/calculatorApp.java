package com.springcore.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class calculatorApp {
	
	public static void main(String[] args) {
		
		ApplicationContext AP = new ClassPathXmlApplicationContext("com/springcore/ambiguity/calculatorconfig.xml");
		
		calculator cal = (calculator) AP.getBean("calculator");
		cal.doSum();
	}

}
