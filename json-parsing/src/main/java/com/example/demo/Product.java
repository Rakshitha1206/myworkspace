package com.example.demo;

public class Product {

	private int id;
	private String productName;
	private double ratePreUnit;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int id, String productName, double ratePreUnit) {
		super();
		this.id = id;
		this.productName = productName;
		this.ratePreUnit = ratePreUnit;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getRatePreUnit() {
		return ratePreUnit;
	}
	public void setRatePreUnit(double ratePreUnit) {
		this.ratePreUnit = ratePreUnit;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", ratePreUnit=" + ratePreUnit + "]";
	}
	
}
