package com.training;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.example.model.*;

public class ApllicationFirSet {

	public static void print(String message,Set<Student> bookList) {
		System.out.println(message);
		for(Student eachBook:bookList) {
			System.out.println(eachBook);
		}
	}
	public static void main(String[] args) {
	
       Student ram = new Student(101,"Ramesh",90,"ram@abc.com");
		
		Student shyam = new Student(102,"Shyam",70,"shyam2abc.com");
      
		Student chotuRam = new Student(101,"Ramesh",90,"ram@abc.com");
		
		HashSet<Student> hashSet = new HashSet<>();
		hashSet.add(shyam);
		hashSet.add(ram);
		boolean isAdded = hashSet.add(chotuRam);
		System.out.println("is Added:="+isAdded);
		print("Hash Set - No Duplicates- only 2 elements should be listed",hashSet);
	
	
	TreeSet<Student> treeSet = new TreeSet<>();
	Student nireesh = new Student(10, "Nireesh",79,"niee@abc.com");

	treeSet.add(ram);
	treeSet.add(shyam);
	treeSet.add(chotuRam);
	treeSet.add(nireesh);
	print("Hash Set - No Duplicates- only 3 elements should be listed",treeSet);
	
	
	}

}
