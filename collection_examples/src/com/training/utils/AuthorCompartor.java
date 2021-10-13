package com.training.utils;

import java.util.Comparator;
import com.example.model.Book;

public class AuthorCompartor implements Comparator<Book> {
	
	public int compare(Book o1, Book o2) {

		return o1.getAuthor().compareTo(o2.getAuthor());
	}


	
}
