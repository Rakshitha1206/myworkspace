package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.entity.Bill;
import com.example.demo.entity.Customer;
import com.example.demo.entity.Invoice;
import com.example.demo.entity.Product;

@Configuration
public class ApplicationConfig {

	//Factory Method
	//Spring IoC container will call this method and 
		// register a bean with the id "sony"
		//"sony" being the attribute name.
	//"ram" being the method name.
	@Bean
	public Customer ram() {
		return new Customer(101,"Ramesh",9840456789L);
	}
	@Bean
	public Customer shyam() {
		return new Customer(123,"Shyam",9876543210L);
	}
	
	//Spring IoC container will call this method and 
	// register a bean with the id "sony"
	//"sony" being the attribute name.
	//overriding the default name which is method name with custom name
	@Bean(name="sony")
	public Product tv() {
		return new Product(202,"Sony Tv",2300);
	}
	
	//passing  Bean | by its Id
	@Bean
	public Bill inv() {
		return new Bill(tv(),ram());
	}
	@Bean(name="ramsInvoice")
	public Invoice ramsInv() {
		return new Invoice(tv(),ram());
	}
}
