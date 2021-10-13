package com.training;

import java.util.Scanner;


public class Application {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 String input="yes";
		 
		 while(input.equals("yes"))
		 {
         System.out.println("Enter the Item ID");
          
         int itemId = sc.nextInt();
         
         System.out.println("Enter the Item Name");
         
         String itemName = sc.next();
         
         System.out.println("Enter the Rate per unit");
         
         double ratePreUnit = sc.nextDouble();
         
         System.out.println("Enter the Category");
         
         String category =sc.next();
         
         System.out.println("Enter the Customer Id");
         
         int customerId = sc.nextInt();
         
         System.out.println("Enter the Customer Name");
         
         String customerName =sc.next();
         
         System.out.println("Enter the customer Category");
         
         String customerType = sc.next();
        
         Item item = new Item(itemId, itemName, ratePreUnit,category);
         Customer customer = new Customer(customerId,customerName,customerType);
         
         ItemService itemservice =new ItemService();
        
         System.out.println("Discount price:"+itemservice.findDiscount(item));
         System.out.println("Discount price:"+itemservice.findDiscount(item,customer));
         
         System.out.println("Do you Want to Continue");
         input = sc.next();
         
		 }
         sc.close();
	
	}

	}

