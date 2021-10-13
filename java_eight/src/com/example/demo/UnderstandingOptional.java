package com.example.demo;

import java.util.Optional;

public class UnderstandingOptional {

	public static String getMessage(int key) {
		switch (key) {
		case 1: 
			return "Happy Birthday";
		case 2:
			return "Happy Deepavali";
		case 3:
			return "Happy Dasara";
		default:
			return "Check again";
			
		}
	}
		
		public static void main(String[] args)
		{
			//System.out.println(getMessage(4).toUpperCase());
			Optional<String> resp = Optional.ofNullable(getMessage(4));
//		    if(resp.isPresent()) {
//		    	System.out.println(resp.get().toUpperCase());
//		    	
//		    }
//		    else {
//		    	System.out.println("Invalid Choice check again");
//		    }
		//resp.orElseThrow(RuntimeException::new);
		System.out.println((resp.orElseGet(  () -> getMessage(4))));
		
		//Optional<String> value = getMessage('a');
		
		//if(value.isPresent()) {
//			System.out.println(value.get());
//		}
		}
}

