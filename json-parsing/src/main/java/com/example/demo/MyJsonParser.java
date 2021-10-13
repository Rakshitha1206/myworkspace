package com.example.demo;
import com.google.gson.*;

public class MyJsonParser {
	private Gson parser;
	
	public MyJsonParser() {
		super();
		this.parser = new GsonBuilder().setPrettyPrinting().create();
	}
	
	public String javaToJson(Product product) {
		
		return parser.toJson(product);
	}
	public Product jsonToJava(String value) {
		
		return parser.fromJson(value, Product.class);
	}
}
