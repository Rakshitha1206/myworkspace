package com.example.demo;

public class LocalAndParameterExample {

	private int number = 200;
	private static String name = "Ramesh";
	
	public void usingLocalVaribel() {
		//int age; 
		// local variables should be initialized before use
		// can not use modifiers like private/protected/public/default
		int age=20;
		System.out.println(age);
		
	}
	public void usingInstanceVarible() {
		System.out.println(number); // number is a instance variable they have a default value
	}
	
	// Passing argument => parameter variable
	public CreditCard usingParameterVariable(CreditCard card) {
		/*
		 * instance variable can access static and instance variable as well as method 
		 */
		System.out.println(name);
		
		card.setCardHolderName("Miss."+card.getCardHolderName());
	    
		return card;
	}
	public static void usingInsatnce() {
		/*
		 * static methods can access only static variable and methods 
		 */
		//System.out.println(number);
	}
	public int usingPrimitive(int num) {
		num=56;
		return num;
	}
	public static void usingInstance() {
		
	}
}

