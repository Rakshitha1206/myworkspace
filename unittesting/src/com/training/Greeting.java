package com.training;

import java.util.*;

public class Greeting {

	public String getMessage() {
		return "HelloIndia";
	}
	public String assignGrade(double mark) {
		String grade = "c";
		if(mark<=40) {
			grade = "b";
		}
		else if(mark>40 && mark <=80) {
			grade="a";
		}
		return grade;
	}
	public void parse(String mark) {
		try {
			int markScored = Integer.parseInt(mark);
			System.out.println(markScored);
			
		}catch(NumberFormatException e) {
			System.out.println(e.getMessage());
			throw e;
		}
	}
	public String getBestBook(int code) {
		List<String> bookList = Arrays.asList("Java","c","spring","c++");
		return bookList.get(code);
	}
}
