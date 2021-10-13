package com.example.demo;

public class AutoBoxing {

	 public static void print(int a,int b)
	 {
		 System.out.println(a+b);
		 }
	 public static void printUsingWrapper(Integer a, Integer b) {
		 System.out.println(a+b+100);
	 }
	 public static void main(String[] args) {
		 print(56,44);
		 //Java uses Autoboxing to convert primitive into object type
		 printUsingWrapper(56,44);
	 }
}
