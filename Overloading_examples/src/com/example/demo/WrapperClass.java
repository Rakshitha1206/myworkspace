package com.example.demo;

public class WrapperClass {

	public static void main(String[] args) {
		
		/*
		 * Command Line Argument values are passed => Run As ,Run Configurations,
		 * Select arguments tab and enter the values
		 */
		
		int rollNumber = Integer.parseInt(args[0]);
		String studentName = args[1];
		double marksScored = Double.parseDouble(args[2]);
		String email = args[3];
		
		Student ram = new Student(rollNumber,studentName,marksScored,email);
	
	    System.out.println(ram.getMarkScored());
	    System.out.println(ram.getEmail());
	    
	    int phoneNumber = 22456589;
	    // Transforming integer representation into String using Integer.toString()
	    String strPhoneNumber = Integer.toString(phoneNumber);
	    
	    //using the String class length method to find the length
	    System.out.println("Phone Number Length :="+strPhoneNumber.length());
	}

}

