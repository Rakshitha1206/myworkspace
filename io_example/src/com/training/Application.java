package com.training;

import com.training.ifaces.BookService;
import com.training.iservices.BookServiceImpl;
import com.training.iservices.BookServiceImplWithStream;
import com.training.model.Book;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		BookService service = new BookServiceImpl();
		BookService obj = new BookServiceImplWithStream();
		int key = 4;
		try {
		switch(key) {
		case 1:
			Book book = new Book(101, "Head First Java", "Kathysieera", 450);
			service = new BookServiceImpl();
		    service.write(book);
		    boolean result = service.write(book);
		    if(result) {
		    	System.out.println("Added to file");
		
		    }
		   
		    break;
		case 2:
			Book[] list = service.read();
			
			for(Book eachBook:list) {
				if(eachBook!=null) {
					System.out.println("Added to the file");
				}
			}
		    break;
		   
		    case 3:
		    	Book jsbook = new Book(103,"Java script","Paul",500);
		    	
		    	
		    	boolean status = obj.write(jsbook);
		    	if(status) {
		    		System.out.println("One Book Serialized");
		    		
		    	}
		   break;
		    case 4:
		    	Book[] foundList = obj.read();
		    	System.out.println(foundList[0]);
		    	break;
		   default:
			   break;
		}
		}catch(Exception e) {
			e.printStackTrace();
		} 
		
	}

}
