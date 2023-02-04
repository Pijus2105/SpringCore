package com.springcore.reference;

public class Employees {
	
	private String Designation;

	public String getDesignation() {
		return Designation;
	}

	@Override
	public String toString() {
		return "Employees [Designation=" + Designation + "]";
	}

	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employees(String designation) {
		super();
		Designation = designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

}
