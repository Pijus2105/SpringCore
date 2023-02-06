package com.springcore.autowiring;

public class Employee {
	
	private Project proj;

	public Project getProj() {
		return proj;
	}

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

	public Employee(Project proj) {
		super();
		this.proj = proj;
		System.out.println("Inside Cons");
	}

}
