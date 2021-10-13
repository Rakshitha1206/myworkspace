package com.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;




public class Application {
	private static ArrayList<Product> productList=null;
	public static void print(List<Product> productList) {
		
		for(Product eachProduct:productList) {
			System.out.println(eachProduct);
		}
	}

	public static void main(String[] args) {

		ApplicationService service = new ApplicationService();
			FoodItems r1 = new FoodItems(1,"biscuit",4,150);
			FoodItems r2 = new FoodItems(1,"coffee",5,250);
			FoodItems r3 = new FoodItems(1,"rice",3,350);
			FoodItems r4 = new FoodItems(1,"riiice",6,350);
			
			service.add(r1);
			service.add(r2);
			service.add(r3);
			service.add(r4);
			
			print(service.topThreeItems("Food"));
	}

	}


