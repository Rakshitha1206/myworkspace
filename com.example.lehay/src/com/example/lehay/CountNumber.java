package com.example.lehay;

public class CountNumber implements Runnable {

	private int countUpTo;
	Counter obj= null;
	
	


	public CountNumber(int countUpTo) {
		super();
		this.countUpTo = countUpTo;
		obj = new Counter(countUpTo);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		System.out.println(Thread.currentThread().getName()+"sum:=" +obj.sumNumber());

	}

}
