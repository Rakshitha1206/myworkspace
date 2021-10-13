package com.example.demo;

public interface Validatator {
	
	public boolean validate();
	default String show() {
		return "show method";
	}

}
