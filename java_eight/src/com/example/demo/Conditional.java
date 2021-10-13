package com.example.demo;

public interface Conditional {
    String Name="Polymorphism";
	public boolean test();
	
	default String show() {
		return "I am from default Method";
	}
	
}
