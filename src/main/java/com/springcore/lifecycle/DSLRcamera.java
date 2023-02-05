package com.springcore.lifecycle;

public class DSLRcamera {
	
	private String price;

	public DSLRcamera(String price) {
		super();
		this.price = price;
	}

	public DSLRcamera() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "DSLRcamera [price=" + price + "]";
	}
	
	
	public void init() {
		System.out.println("Init inside");
	}
	
	public void destroy() {
		System.out.println("Destroy outside");
	}

}
