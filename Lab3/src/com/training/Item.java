package com.training;

public class Item {
	private int ItemId;
	private String ItemName;
	private double RatePreUnit ;
	private String category ;
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(int itemId, String itemName, double ratePreUnit, String category) {
		super();
		ItemId = itemId;
		ItemName = itemName;
		RatePreUnit = ratePreUnit;
		this.category = category;
	}
	public int getItemId() {
		return ItemId;
	}
	public void setItemId(int itemId) {
		ItemId = itemId;
	}
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public double getRatePreUnit() {
		return RatePreUnit;
	}
	public void setRatePreUnit(double ratePreUnit) {
		RatePreUnit = ratePreUnit;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
	
}
