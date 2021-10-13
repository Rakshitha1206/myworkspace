package com.traning;

import java.util.Scanner;

public class UsingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the roll number");
          
         int rollNumber = sc.nextInt();
         
         System.out.println("Enter the name");
         
         String studentName = sc.next();
         
         System.out.println("Enter the Mark scored");
         
         double markScored = sc.nextDouble();
         
         System.out.println("Enter the email");
         
         String email =sc.next();
         
         Student obj = new Student(rollNumber,studentName,markScored,email);
         
        System.out.println(obj.getStudentName()+obj.getMarkScored());
        
         sc.close();
	}

}
