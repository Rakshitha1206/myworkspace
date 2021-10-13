package com.traning;

public class UsingSwichCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String time="Afternoon";
		// Switch case with String available from java 7 onwards
		
		switch(time){
		case "morning":
			System.out.println("Good Morning");
            break;
		case "Afternoon":
			System.out.println("Good After Noon");
			break;
		case "evening":
			System.out.println("Good Evening");
			break;
		default:
			 System.out.println("Hi");
			 break;
		}
	}

}
