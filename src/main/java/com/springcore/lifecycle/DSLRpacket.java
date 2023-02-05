package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


//Interfaces
public class DSLRpacket implements InitializingBean, DisposableBean{
	
	private String DSLRpacket;
	
	public DSLRpacket() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DSLRpacket(String dSLRpacket) {
		super();
		DSLRpacket = dSLRpacket;
	}

	@Override
	public String toString() {
		return "DSLRpacket [DSLRpacket=" + DSLRpacket + "]";
	}

	public String getDSLRpacket() {
		return DSLRpacket;
	}

	public void setDSLRpacket(String dSLRpacket) {
		DSLRpacket = dSLRpacket;
	}

	
	
	public void afterPropertiesSet() throws Exception {
		
        System.out.println("Open the seal");
		
	}

	public void destroy() throws Exception {
		
       System.out.println("Thrown the packet");
		
	}

	

}
