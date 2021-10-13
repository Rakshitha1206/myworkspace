package com.example.demo;

import java.sql.*;
import java.time.LocalDate;
import java.util.*;

import com.example.demo.utils.DbConnection;
import com.training.daos.StudentDaolmpl;
import com.training.entity.Student;
import com.training.ifaces.CrudRepository;

public class Application {

	public static void main(String[] args) {

		Connection con = DbConnection.getORacleConnection();
		CrudRepository<Student,Integer> repo = new StudentDaolmpl(con);
		Student rak = new Student(118,"Rakshith",LocalDate.of(2000, 6, 12),95);
        int key=3;
		if(key==1) {
		boolean result = repo.add(rak);
		if(result) {
			System.out.println("One Student added");
		}
	}
        
	if(key==2) {
		List<Student> list = repo.findAll();
		for(Student eachStudent : list) {
			System.out.println(eachStudent);
		}
	}
	if(key==3) {
		Student result=repo.findById(101);
		System.out.println(result);
	}
	if(key==4) {
		Student ram = new Student(103,"Ramsh",LocalDate.of(1997, 8, 10),90);
		boolean result = repo.remove(ram);
		if(result) {
			System.out.println("One Student deleted");
		}
	}
}
}
