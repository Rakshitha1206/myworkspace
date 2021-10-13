package com.example.demo.exceptions;

public class RangeCheckExcpetion extends Exception {

	private String message;

	public RangeCheckExcpetion(String message) {
		super(message);
		this.message= message;
	}

	@Override
	public String getMessage() {

		return "Exception :="+message;
	}

	
}
