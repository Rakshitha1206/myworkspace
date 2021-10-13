package com.training.poly;

import com.training.ifaces.Conditional;

public class Professor extends Person implements Conditional {
     private String qualification;	
	
	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Professor(String qualification) {
		super();
		this.qualification = qualification;
	}


	@Override
	public boolean test() {
		
		return this.qualification.toLowerCase().equals("phd");
	}

}
