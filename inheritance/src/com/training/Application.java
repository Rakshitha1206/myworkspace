package com.training;

public class Application {
  
	 Object obj;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       Book headFirstJava = new Book(101,"Head First Java","Kathy Sieera",450.00);
//	 
//       System.out.println(headFirstJava.toString());
//	
//	Insurance lifeInsurance = new Insurance(100,"Rakshitha",200000.00);
//	
//	System.out.println("Expected:10000 => actual :="+lifeInsurance.calculatePremium());
//	
	VehicleInsurance vechInsurance = new VehicleInsurance(101,"suresh",60000,"bike");
	
	System.out.println("Expected:1000 => Actual:="+vechInsurance.calculatePremium());
	
	}

}
