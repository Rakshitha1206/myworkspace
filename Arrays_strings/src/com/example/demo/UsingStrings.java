package com.example.demo;

public class UsingStrings {

	public static void main(String[] args) {
		
		String city = "Hyderabad";
		
		String firstName="Rajesh";
		
		String lastName ="Krishna";
		
		String college ="SJCE College";
		
		System.out.println("Length of the String :="+city.length());
        
		System.out.println("Transfer To upper case:="+lastName.toUpperCase());
		
		System.out.println("Substring : ="+city.substring(6,9));
		
		System.out.println("College Length Before trim"+college.length());
		System.out.println("College Length After trim"+college.trim().length());
	
	   System.out.println("Character at Position 2 in college:="+college.charAt(1));
	   System.out.println("Index of character C in college:="+college.indexOf("C"));
	}

}
