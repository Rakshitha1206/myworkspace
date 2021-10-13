package com.example.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@Data // this provides setter getter tostring method will come
@FieldDefaults(level=AccessLevel.PRIVATE)
@NoArgsConstructor // lombak will be able give all these no arg constuctor AND all arg constructor 
@AllArgsConstructor
public class Customer {

	int id;
	String customerName;
	long phoneNumber;
}
