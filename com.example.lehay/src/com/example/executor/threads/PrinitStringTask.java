package com.example.executor.threads;

public class PrinitStringTask implements Runnable {

	
	private String str1;
	private String str2;
	
	
	public PrinitStringTask(String str1, String str2) {
		super();
		this.str1 = str1;
		this.str2 = str2;
		
		/*
		 * the following lines are commented out because we are planning
		 * to use executor framework
		 * In executor framework thread pools are created and we 
		 * only need to submit the task and create threads
		 */
		//Thread thread = new Thread(this);
		//thread.start();
	}


	@Override
	public void run() {

		PrintStrings.print(str1, str2);

	}

}
