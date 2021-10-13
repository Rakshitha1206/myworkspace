package com.training;

public class FoodItems extends Product {

	private  int mfgDate;
	private  int expirtyDate;
	private boolean isVegetarian;
	
	
	public FoodItems() {
		super();
		// TODO Auto-generated constructor stub
	}


	public FoodItems(int itemCode, String itemName, double quantity, double unitPrice) {
		super(itemCode, itemName, quantity, unitPrice);
		// TODO Auto-generated constructor stub
	}


	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
