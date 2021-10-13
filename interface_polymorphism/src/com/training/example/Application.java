package com.training.example;

import com.training.ifaces.IFunction;

public class Application {

	public static void print(IFunction func,double arg) {
		System.out.println(func.apply(arg));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CurrencyConverter inrToUsd =  new CurrencyConverter();
		System.out.println(inrToUsd.apply(100));
		TempConverter forToCel = new TempConverter();
		System.out.println(forToCel.apply(34));

	}

}
