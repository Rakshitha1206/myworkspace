package com.training.repository;

import java.util.*;

import com.example.model.Book;
import com.training.ifaces.CrudRepository;

public class BookRepositary implements CrudRepository {

	private ArrayList<Book> bookList;
	
	
	public BookRepositary() {
		super();
	this.bookList = new ArrayList<>();
	}

	@Override
	public boolean add(Book book) {
		/*
		 * type safety or generic prevents from adding any other object other than book
		 */
		//this.bookList.add(new String("hello");
		//System.out.println("List Size:="+this.bookList.size());
		return this.bookList.add(book);
	}

	

	@Override
	public boolean remove(Book book) {

		return this.bookList.remove(book);
	}

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return this.bookList;
	}






}
