package com.example.stream;

import java.util.List;
import java.util.function.*;
import com.example.demo.Student;

public class StreamApplication {

	public static void main(String[] args) {

		StudentService service = new StudentService();
//		List<Student> markSeventyAbove = service.userFilter();
//		System.out.println("Seventy Marks and Above");
//		markSeventyAbove.forEach(System.out::println);
//		Predicate<Student> lessThanSeventy = e -> e.getMarkScored()<70;
//		Predicate<Student> lessThanNinety = e -> e.getMarkScored()<90;
//		
//		System.out.println("Less than Seventy");
//		service.userFilter(lessThanSeventy).forEach(System.out::println);
//		
//
//		System.out.println("Less than Ninety");
//		service.userFilter(lessThanNinety).forEach(System.out::println);
		
//		service.getStudentNames().forEach(System.out::println);
//      service.transformToMap()
//      .forEach( (key,value) -> System.out.println(key + ":"+value));
//       
		System.out.println("Highest Mark :"+service.highesMark());
		System.out.println("sorted by name"+service.sortedByName());
		
		
	}

}
