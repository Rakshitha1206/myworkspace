package com.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class ApplicationService {

	private ArrayList<Product> productList=null;
	
	public ArrayList<Product> getProductList() {
		return productList;
	}

	public void setProductList(ArrayList<Product> productList) {
		this.productList = productList;
	}

	ApplicationService(){
		productList = new ArrayList<Product>();
	}
	
	public boolean add(Product item) {
		return productList.add(item);
	}
	public ArrayList<Product> topThreeItems(String itemType){
		
		Collections.sort(productList);
		ArrayList<Product> output = new ArrayList<>();
		int j=0;
		for(int i=0;i<productList.size();i++)
		{
			if(productList.get(i).itemType.equals(itemType))
			output.add(productList.get(i));
			j++;
			if(j==3)
				return output;
		}
		return output;
	}
}
