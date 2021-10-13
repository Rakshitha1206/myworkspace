package com.training;

public class ItemService {

	public double findDiscount(Item item) {
		
		double discount = 5;

		discount = (discount /100)*(item.getRatePreUnit());
		
		return discount;
		
	}
public double findDiscount(Item item,Customer customer) {
	
	double MP= item.getRatePreUnit();
	
	if(customer.getCustomerType()=="Corporate")
	{
		return(MP-0.15*MP);
	}
	else if(customer.getCustomerType()=="Retail")
	{
		return(MP-0.10*MP);
	}
	else
	{
		return(MP-0.5*MP);
		
	}
	
}

}
