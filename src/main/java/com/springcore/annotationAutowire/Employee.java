package com.springcore.annotationAutowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	@Autowired
	@Qualifier("proj2")
	private Project proj;

	public Project getProj() {
		return proj;
	}

	@Autowired
	@Qualifier("proj2")
	public void setProj(Project proj) {
		this.proj = proj;
	}

	@Override
	public String toString() {
		return "Employee [proj=" + proj + "]";
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Autowired
	
	public Employee(Project proj) {
		super();
		this.proj = proj;
		System.out.println("Inside Cons");
	}

}
