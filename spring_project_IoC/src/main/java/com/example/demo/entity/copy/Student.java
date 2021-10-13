package com.example.demo.entity.copy;


import org.springframework.beans.factory.annotation.Autowired;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level=AccessLevel.PRIVATE)
@NoArgsConstructor 
@AllArgsConstructor
public class Student {

	int rollNumber;
	 String studentName;
	 double markScored;
	 String email;
	 
	
	 
}
