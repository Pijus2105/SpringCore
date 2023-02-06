package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class DSLRlens {
	
	private String lens255;

	public String getLens255() {
		return lens255;
	}

	public void setLens255(String lens255) {
		this.lens255 = lens255;
	}

	@Override
	public String toString() {
		return "DSLRlens [lens255=" + lens255 + "]";
	}

	public DSLRlens(String lens255) {
		super();
		this.lens255 = lens255;
	}

	public DSLRlens() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@PostConstruct
	public void Lenscup () {
		
		System.out.println("Price - 7500");
	}
	
	@PreDestroy
    public void Lenshanle () {
		
		System.out.println("Price - 14000");
	}

}
