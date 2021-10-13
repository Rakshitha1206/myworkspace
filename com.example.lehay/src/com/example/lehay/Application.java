package com.example.lehay;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try {
    	 Runnable tencounter = new CountNumber(10);		
 		Thread t1 = new Thread(tencounter,"Ten Counter");
 		t1.start();
 		
 		Thread.sleep(1600);
 		
 		Runnable hundredcounter = new CountNumber(100);
 		Thread t2 = new Thread(hundredcounter,"Hundered Counter");
 		t2.start();
 		Thread.sleep(1600);
 		
 		Runnable thousandcounter = new CountNumber(1000);
 		Thread t3 = new Thread(thousandcounter,"Thousand Counter");
 		t3.start();
 		Thread.sleep(1600);
 		
     }
     catch(InterruptedException e) {
    	 e.printStackTrace();
     }
	
		
	}

}
