package com.example.executor.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Application {
	public static void main(String[] args) {

	Runnable task1 = 	new PrinitStringTask("Idly","Sambhar");
	Runnable task2 = 	new PrinitStringTask("Pizza","Coke");
	Runnable task3 = 	new PrinitStringTask("Parantha","Samosar");
	Runnable task4 = 	new PrinitStringTask("Tea","Bisicuit");
	
	Runnable[] taskList = {task1,task2,task3,task4};
	//ExecutorService service = Executors.newSingleThreadExecutor();
	ExecutorService service = Executors.newFixedThreadPool(4);
	
	for(Runnable eachTask :taskList) {
		service.submit(eachTask);
	}
	service.shutdown();
	}

}
