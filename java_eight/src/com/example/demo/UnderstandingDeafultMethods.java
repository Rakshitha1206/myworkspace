package com.example.demo;

public class UnderstandingDeafultMethods implements Conditional, Validatator{

	@Override
	public boolean validate() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean test() {
		// TODO Auto-generated method stub
		return false;
	}

//	@Override
//	public String show() {
//		return "This from class";
//	}
//	
	/* 
	 * two interfaces having same method 
	 * we can call one of the overridden method 
	 * or both completely new 
	 */
	
	@Override
	public String show() {
		return Validatator.super.show()+Conditional.super.show()+"This from class";
	}


}
