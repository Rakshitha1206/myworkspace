package com.example.demo;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.*;
import reactor.core.publisher.*;

@SpringBootApplication
public class ReactiveSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveSpringApplication.class, args);
		
		Flux<String> namePublisher = Flux.just("Rakshitha","Archana","amrita","sahana");
		namePublisher.subscribe(System.out::println);
		namePublisher.subscribe(new Subscriber() {

			@Override
			public void onSubscribe(Subscription s) {
		       s.request(4);
				//System.out.println(s);
			}

			@Override
			public void onNext(Object t) {
		      System.out.println("onNext called" + t.toString());
				
			}

			@Override
			public void onError(Throwable t) {
			System.out.println(t.getMessage());
			
			
				
			}

			@Override
			public void onComplete() {
				System.out.println("Completed");
				
			}});
	}

}
