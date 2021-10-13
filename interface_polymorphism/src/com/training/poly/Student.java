package com.training.poly;

import java.io.Serializable;
import com.training.ifaces.Conditional;
/*
 * marker interface => interface that does not have any method 
 * function interface => interface that has just one abstract method
 * 
 */

public class Student extends Person implements Conditional,Serializable{

	private int markScored;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Student(int markScored) {
		super();
		this.markScored = markScored;
	}


	@Override
	public boolean test() {
		// TODO Auto-generated method stub
		return this.markScored>80;
	}

}
