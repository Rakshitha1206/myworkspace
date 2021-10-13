package com.training;

public abstract class Product implements Comparable <Product>{
	
	private int itemCode;
	private String itemName;
	private double quantity;
	private double unitPrice;
	public String itemType;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int itemCode, String itemName, double quantity, double unitPrice,String itemType) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.itemType= itemType;
	}
	public int getItemCode() {
		return itemCode;
	}
	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	@Override
	public String toString() {
		return "Product [itemCode=" + itemCode + ", itemName=" + itemName + ", quantity=" + quantity + ", unitPrice="
				+ unitPrice +" ,itemType=" + itemType+"]";
	}

	@Override
	public int compareTo(Product o) {
     if(o.quantity < o.getQuantity())
		return 1;
     if(o.quantity > o.getQuantity())
    	 return -1;
	return 0;
	}

}
