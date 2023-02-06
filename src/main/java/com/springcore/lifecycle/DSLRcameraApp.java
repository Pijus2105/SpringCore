package com.springcore.lifecycle;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DSLRcameraApp {

	public static void main(String[] args) {
		
		
		AbstractApplicationContext AP = new ClassPathXmlApplicationContext("com/springcore/lifecycle/DSLRconfig.xml");
		
		AP.registerShutdownHook();
		
		DSLRcamera DS = (DSLRcamera) AP.getBean("price");
		
		System.out.println(DS);
		
		System.out.println("++++++++++++++++++++++++++++++++++");
		
		DSLRpacket DP = (DSLRpacket) AP.getBean("DSLRpacket");
		
		System.out.println(DP);
		
		System.out.println("++++++++++++++++++++++++++++++++++");
		
		DSLRlens lens = (DSLRlens) AP.getBean("lens255");
		
		System.out.println(lens);

	}

}
