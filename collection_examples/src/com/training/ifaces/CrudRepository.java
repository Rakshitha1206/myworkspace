package com.training.ifaces;


import java.util.*;

import com.example.model.*;
public interface CrudRepository {

	public boolean add(Book book);
	public List<Book> findAll();
	
	public boolean remove(Book book);
	
}
