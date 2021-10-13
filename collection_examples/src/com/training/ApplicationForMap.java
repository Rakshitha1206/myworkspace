package com.training;

import com.example.model.Student;
import java.util.*;

public class ApplicationForMap {

	public static void main(String[] args) {

        Student ram = new Student(101,"Ramesh",90,"ram@abc.com");
		
		Student shyam = new Student(102,"Shyam",70,"shyam2abc.com");
		
		Student chotuShyam = new Student(102,"Chotu Shyam",70,"shyam2abc.com");

	     HashMap<Integer,Student> list = new HashMap<>();
	     
	     list.put(200, ram);
	     list.put(201, shyam);
	     Object obj = list.put(201, chotuShyam);
	     
	     System.out.println(obj);
	     
	     System.out.println(list.get(201));
	
	}

}
