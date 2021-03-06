package com.example.demo;

import java.util.List;

import org.apache.juli.logging.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.training.entity.OrderBook;

import com.example.demo.entity.Bill;
import com.example.demo.entity.Customer;
import com.example.demo.entity.Invoice;
import com.example.demo.entity.Product;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication(scanBasePackages={"com.example.demo","org.training.entity"})
@Slf4j
public class SpringIoCApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext txt=SpringApplication.run(SpringIoCApplication.class, args);
	
		Customer customer = txt.getBean("shyam",Customer.class);
		log.info(customer.toString());
		
		Product obj= txt.getBean("sony", Product.class);
		log.info(obj.toString());
		
		Invoice inv = txt.getBean("invoice",Invoice.class);
		log.info(inv.toString());
		
		Bill bill = txt.getBean(Bill.class);
		log.info(bill.toString());
		
		OrderBook book = txt.getBean(OrderBook.class);
		log.info(book.toString());
		
		List<Invoice> list = book.getInvList();
		list.forEach(System.out::println);
		txt.close();
	
	}

}
