package com.example.demo;


import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;


public class BuiltInFunctionInterfaces {

	public static void main(String[] args) {


			List<String> names = Arrays.asList("Ramesh","Suresh","Ganesh");
			List<String> cities = Arrays.asList("Mysuru","Tumkuru","Bengaluru");
			
			
			for(String eachName:names) {
				System.out.println(eachName);
			}
		
			names.forEach(e -> System.out.println(e));
			
			//Consumer<String> print = (e) -> System.out.println(e);
			
			Consumer<String> print =  System.out::println;
			
			names.forEach(print);
			cities.forEach(print);
			
			Student ram = new Student(101,"Ramesh",LocalDate.now(),90);
            
			Predicate<Student> result = (obj) -> obj.getMarkScored()>80;
	        System.out.println("Result :="+result.test(ram));
	        
	        Supplier<String> message = () -> "Happy Dasara";

	        System.out.println("Greetings:"+message.get());
	
	        Function<String,Integer> func = (arg) -> arg.length();
	
	        System.out.println(func.apply(message.get()));
	}
	

}
