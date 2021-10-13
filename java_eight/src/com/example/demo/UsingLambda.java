package com.example.demo;

import java.util.function.Predicate;

class Example implements Runnable{
	public void run() {
		for(int i =1;i<=10;i++) {
			System.out.println(i);
		}
	}
}


public class UsingLambda {
	
	public static void main(String[] args) {
		
		Runnable task = () ->{
			for(int i=1;i<=10;i++) {
				System.out.println(i);
			}
		};
		Thread thread = new Thread(task);
		thread.start();
		
		Conditional passMark = () -> "rameshkummarreddy".length()>10;
		System.out.println(passMark.test());
		System.out.println(passMark.show());
		
		Predicate<Integer> isPAssMark = (mark) -> mark>60;
		System.err.println("Pass- Status:="+isPAssMark.test(27));
				
	}

}
