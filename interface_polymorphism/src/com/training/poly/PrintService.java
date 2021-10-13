package com.training.poly;

import com.training.ifaces.Conditional;

public class PrintService {
	
//	public static void print(Student obj) {
//		System.out.println(obj.test());
//	}
//	public static void print(Professor obj) {
//		System.out.println(obj.test());
//	}
	public static void print(Conditional poly)
	{
		System.out.println(poly.test());
	}
	
	public static void print(Conditional[] list) {
		for(Conditional eachElement:list) {
		   System.out.println(eachElement.test());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student ram = new Student(89);
		Professor shyam = new Professor("phd");
		
		
		
		Student mainsh = new Student(49);
		Professor vimal= new Professor("BE");
		
		
		Conditional[] list = {ram,shyam,mainsh,vimal};
		print(list);
		
	}

}
