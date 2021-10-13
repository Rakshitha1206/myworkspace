package com.example.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.example.demo.exceptions.RangeCheckExcpetion;
import com.example.demo.exceptions.Student;
public class Application {
	public static void main(String[] args) {
		
		MyExceptionHandler handler = new MyExceptionHandler();
		
		
		try (Scanner sc = new Scanner(System.in);){
		System.out.println("Enter choice");
		
		int key=sc.nextInt();
		
		
		switch(key) {
		case 1:
		handler.usingClassCastException();
	    break;
		case 2:
		handler.usingMultiCatch("234");
		break;
		case 3:
			handler.tryWithMultipleCatch();
			break;
		case 4: 
			handler.usingFinallyBlock(); 
			break;
		case 5:
			Student ram= new Student();
			ram.setMarkScored(89);
			System.err.println();
		case 6:
			Student shyam = new Student(202,"Shaym",178,"shyam@abc.com");
			System.err.println(shyam);
			break;
		default:
			break;
		}
		
		}catch(InputMismatchException | RangeCheckExcpetion e) {
	 e.printStackTrace();
	}

}
}
