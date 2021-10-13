package com.example.demo;

/*
 * 
 */
public class PrimitiveCasting {
 
	public static void main(String[] args) {
		
		int age = 23;
		// here explicit casting is not required => because int => long, upcating
		long maxAge =age;
		
		long salaryPerMonth = 75000;
		
		// int salary = salaryPerMonth;
	 
	    // Casting Long to int => down casting
	   
		int salary = (int)salaryPerMonth;
		
		System.out.println(salary);
	}
}
