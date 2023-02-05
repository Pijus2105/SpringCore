package com.springcore.ambiguity;

public class calculator {
	
	private int num1;
	private int num2;
	
	
	public calculator(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		
		System.out.println("Integer value is a");
	}

	public calculator(String num1, String num2) {
		super();
		this.num1=Integer.parseInt(num1);
		this.num2=Integer.parseInt(num2);
		
	}

	public calculator(double num1, double num2) {
		super();
		this.num1 = (int) num1;
		this.num2 = (int) num2;
		System.out.println("Double value is a");
	}
	
	
	public void doSum() {
		
		System.out.println("Two number addition is : - " + (this.num1+this.num2));
	}

}
