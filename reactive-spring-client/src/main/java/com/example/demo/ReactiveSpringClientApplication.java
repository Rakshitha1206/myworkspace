package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class ReactiveSpringClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveSpringClientApplication.class, args);
	}

	/**
	 * @SpringBootApplication has @configuration annotation into it
	 * so we can declare factory methods with @Bean is this class itself
	 * Instead of creating 
	 */
	
	@Bean 
	WebClient.Builder builder(){
       return WebClient.builder();
	}
	@Bean
	WebClient client(WebClient.Builder builderRef) {
	return builderRef.build();
	}
}