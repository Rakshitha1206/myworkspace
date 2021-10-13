package com.example.demo;

public class Application {

	public static void main(String[] args) {
		
		CreditCard rakshitha = new CreditCard(101,"Rakshitha");
		CreditCard ram  = new CreditCard(101,"Ram Reddy");
		CreditCard rashu = new CreditCard(101,"Rashu Sharma");
		CreditCard sahana = new CreditCard(101,"sahana Reddy");
		CreditCard archana = new CreditCard(101,"Archana Sharma");
	
 
	 CreditCardService service = new CreditCardService();
	 service.addCard(rakshitha);
	 service.addCard(ram);
	 service.addCard(rashu);
	 service.addCard(sahana);
	 service.addCard(archana);
	 
	 CreditCard[] list = service.getCardList();
	 int reddy=0;
	 int sharma=0;
	 
	 for(CreditCard eachcard:list)
	 {
		 String name = eachcard.getCardHolderName();
		 if(name.contains("Reddy")) {
			 reddy++;
		 }
		 else if(name.contains("Sharma"))
		 {
			 sharma++;
		 }
		 else
		 {
			 System.out.println("No Reddy or Sharma");
		 }
			 System.out.println(eachcard);
			 
		 
	 }
	 System.out.println("Reddy Count:"+ reddy);
	 System.out.println("Sharma Count:"+sharma);
}
}