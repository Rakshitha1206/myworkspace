package com.training.entity;
import com.training.Column;
import com.training.sterotypes.Table;

@Table(tableName = "vidyarthi")
public class Student {

 @Column(name="rollNumber")
	private int id;
 
 @Column(name="firstName")
	private String name;
	public Student() {
		super();
	}

}
