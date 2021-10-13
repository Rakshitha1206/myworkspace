package com.example.executor.threads;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

	String message;
	public MyCallable() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MyCallable(String message) {
		super();
		this.message = message;
	}
	public String call() throws Exception {
		return "Hello-"+ message;
	}

	
}
