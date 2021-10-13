package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.CreditCard;

@SpringBootApplication
public class CreditCardServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreditCardServiceApplication.class, args);
	}

	@Bean
	public CreditCard card1() {
		return new CreditCard(883,"Rakshitha",80000);
		
	}
	@Bean 
	public CreditCard card2() {
		return new CreditCard(984,"Chandan",96000);
	}
}
