package com.training.repository;

import java.util.Collections;
import java.util.List;

import com.example.model.*;
import com.training.ifaces.CrudRepository;
import com.training.utils.AuthorCompartor;
import com.training.utils.BookNameComparator;
public class Library {

	public static void print(String message,List<Book> bookList) {
		System.out.println(message);
		for(Book eachBook:bookList) {
			System.out.println(eachBook);
		}
	}
	public static void main(String[] args) {

		Book java = new Book(100, "Effective Java", "Bruce",550);
		Book c = new Book(101, "Anci C", "Balaguruswamy",450);
		Book python = new Book(112, "Mastering Python", "Bruce Lee",650);
		
		CrudRepository repo =new  BookRepositary();

		repo.add(java);
		repo.add(c);
		repo.add(python);
		
		List<Book> bookList = repo.findAll();
		
//		for(Book eachBook:bookList) {
//			System.out.println(eachBook);
//		}
//		System.out.println(bookList.size());
//		bookList.set(2, python);
//		
//		System.out.println(bookList.size());
//		
//		System.out.println(bookList.size());
//		
//		System.out.println(bookList.get(1) + ","+ bookList.get(2));
//		
//		System.out.println("After Setting Element");
//		for(Book eachbook:bookList) {
//			System.out.println(eachbook);
//			
//		}
		     Collections.sort(bookList);
		     print("Sorted By Number",bookList);
			
			Collections.sort(bookList,new BookNameComparator());
			print("Sorted By Name",bookList);
			
			Collections.sort(bookList,new AuthorCompartor());
			print("Sorted By Author",bookList);
				
	
}
}
