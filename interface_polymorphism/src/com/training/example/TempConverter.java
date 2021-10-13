package com.training.example;

import com.training.ifaces.IFunction;

public class TempConverter implements IFunction {

	@Override
	public double apply(double arg) {
		// TODO Auto-generated method stub
		return (5.0/9.0)*(arg-32);
	}

}
