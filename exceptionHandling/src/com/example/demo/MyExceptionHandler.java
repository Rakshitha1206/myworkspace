package com.example.demo;

public class MyExceptionHandler {
	
	//Example for Unchecked Exception => RunTime Exception
	//All Classes which extends runtime exception are checked
	public void usingClassCastException() {
		
		Object ageObj = Integer.valueOf(20);
		
		try {
			Integer age = (Integer) ageObj;
			System.out.println(age);
		} catch (ClassCastException e) {
			// TODO Auto-generated 
		
		System.err.println("ageObj should be a number");
		e.printStackTrace();
	}

}
	public void usingMultiCatch(String strNumber) {
		String[] value = {"ram" , "shaym"};
		String city =null;
		
		try {
			int num = Integer.parseInt(strNumber);
			System.out.println(city.length());
			
			System.out.println(num);
			System.out.println(value[2]);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.err.println("Argument should be number[0-9]");
			
			e.printStackTrace();
		}catch(NullPointerException e) {
			System.out.println("Argument Should not be null");
		}
		catch(Exception e) {
			System.out.println("Handle all other exception");
			e.printStackTrace();
		}
	}
	
	public void tryWithMultipleCatch() {
		try {
			int numerator = 20;
			int[] denominators = {10,0};
			System.out.println(numerator/denominators[1]);
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
	          e.printStackTrace();
		}
}
	public void usingFinallyBlock() {
		try {
			int numerator = 20;
			int[] denomintors = {10,0};
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
	          e.printStackTrace();
			
		}
		finally {
			System.out.println("Inside finially Block");
		}
	}
	
	}


