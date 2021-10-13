package com.example.demo;

public class Application {
	
	public static void print(CreditCard card) {
		
		System.out.println(card.getCardHolderName());
		System.out.println(card.getCardnumber());
		System.out.println(CreditCard.getCardProvider());
		//System.out.println(card.getCardProvider());
		/*
		 * static method should be accessed with Class Name=>ClassName.method()
		 * static method should NOT accessed with obj.method(); if its done warning is given
		 */
	}

	public static void main(String[] args) {
		
        CreditCard card = new CreditCard(1011, "Rakshitha");
       /*
        * since print is a static method of the same class it can be invoked
        * even without using ClassName  . but it could be called with ClassName
        */
        
       // print(card);
        LocalAndParameterExample obj = new LocalAndParameterExample();
        
        obj.usingLocalVaribel();
        /*
         * Expected output is 0 because instance variable has default value
         * default value for integer is 0
         */
        obj.usingInstanceVarible();
        
        System.out.println(card.getCardHolderName());
        //When you are passing objects its copy of reference is passed
        //so changes made to the objects inside the method will get reflected here also
        obj.usingParameterVariable(card);
        
        System.out.println(card.getCardHolderName());
	   
	     int num=89;
	     
	     System.out.println("Number: ="+num);
	     
	     obj.usingPrimitive(num);
	     
	     System.out.println("Number Again:="+num);
	
	
	}

}
