package com.training.utils;

import java.util.Comparator;
import com.example.model.Book;

public class BookNameComparator implements Comparator<Book> {

	public int compare(Book o1, Book o2) {

		return o1.getBookName().compareTo(o1.getBookName());
	}



	
}
