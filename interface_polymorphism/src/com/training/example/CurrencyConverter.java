package com.training.example;

import com.training.ifaces.IFunction;

public class CurrencyConverter implements IFunction {

	@Override
	public double apply(double arg) {
		
		return arg*70;
	}

}
