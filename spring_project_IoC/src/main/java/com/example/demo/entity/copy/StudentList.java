package com.example.demo.entity.copy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Component
@Lazy //if not this then it is eager
public class StudentList {

	
	
	public StudentList() {
		super();
		System.out.println("===== Student Service Called ======");
	}

	
	 List<Student> studList;
//	Student stud;

	
//	 //consructor DI with Qualifier
//	public StudentList(@Qualifier("bama") Student stud) {
//		super();
//		this.stud = stud;
//	}

	
}
