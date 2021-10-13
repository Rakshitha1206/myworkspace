package com.example.demo;
import java.util.*;
public class StudentService {

	//HashMap<String,Student>details;
	HashMap<String,List<Student>>details;

	public StudentService() {
		details = new HashMap<>();
		List<Student> mcaList = Arrays.asList(new Student(101,"Ezhil",90),new Student(102,"Vikky",92));
		List<Student> beList = Arrays.asList(new Student(201,"Anand",70),new Student(202,"Rikky",82));
		
		details.put("be", beList);
		details.put("mca", mcaList);
		
	}
	public List<Student> findByBranch(String branch) {
		return details.get(branch);
	}
}
