package com.springcore.reference;

public class Company {
	
	private String Team;
	private Employees Designation;
	
	@Override
	public String toString() {
		return "Company [Team=" + Team + ", Designation=" + Designation + "]";
	}
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Company(String team, Employees designation) {
		super();
		Team = team;
		Designation = designation;
	}
	public String getTeam() {
		return Team;
	}
	public void setTeam(String team) {
		Team = team;
	}
	public Employees getDesignation() {
		return Designation;
	}
	public void setDesignation(Employees designation) {
		Designation = designation;
	}

}
