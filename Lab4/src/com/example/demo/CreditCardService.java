package com.example.demo;

public class CreditCardService {
  
	private CreditCard[] cardList;
    private static int maxSize =5;
    private static int count=0;
	public CreditCardService(CreditCard[] cardList) {
		super();
		this.cardList = cardList;
	}
	public CreditCardService() {
		super();
		 this.cardList=new CreditCard[5];
		
	}
	public boolean addCard(CreditCard cardList) {
	   	 if(count==maxSize) {
	   		 
	   		 System.out.println("Array Size is full");
	   		 return false;
	   	 } 
	   	 else {
	   		 this.cardList[count] = cardList;
	       	 count++; 
	       	 return true;
	   		 
	   	 }
	   		
	    }
	
    public CreditCard[] getCardList() {
   	 return this.cardList;
    }
}
    
	
    
    

