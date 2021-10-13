package com.training;

public class CivilEngineer implements Billable {

	private int sal;
	@Override
	public double calculate(Object obj) {
		
		return sal*0.5;
	}

}
