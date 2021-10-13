package org.training;

import com.training.Student;

public class SecondApplication {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Student ram = new Student();
		
		//System.out.println(ram.rollNumber); //rollNumber is marked private hence not visible
		//System.out.println(ram.studentName); // default package, since org.training is a different package is not visible  
		//System.out.println(ram.markScored); // protected-since its a different package is not vissible
		System.out.println(ram.email); //  public
	}
}
