package com.example.demo;

public class CreditCard {
	private long cardnumber; // instance variable
	private String cardHolderName; // instance variable
	private static String cardProvider = "visa"; // class variable
	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}/*
	* card Provider is not added to constructor because its a static variable
	* Static variable are shared
	*/
	public CreditCard(long cardnumber, String cardHolderName) {
		super();
		this.cardnumber = cardnumber;
		this.cardHolderName = cardHolderName;
	}
	public long getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(long cardnumber) {
		this.cardnumber = cardnumber;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public static String getCardProvider() {
		return cardProvider;
	}
	public static void setCardProvider(String cardProvider) {
		CreditCard.cardProvider = cardProvider;
	}
	@Override
	public String toString() {
		return "CreditCard [cardnumber=" + cardnumber + ", cardHolderName=" + cardHolderName + "]";
	}
	
	

}
