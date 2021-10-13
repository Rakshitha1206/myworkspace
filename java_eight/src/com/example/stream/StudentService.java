package com.example.stream;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.training.entity.*;

public class StudentService {

	
	private List<Student> studentList;  	public StudentService() { 		super(); 		
	this.studentList = new ArrayList<>(); 		 		
	this.studentList.add(new Student(201,"Harish",LocalDate.of(1997, 10,14),94)); 		
	this.studentList.add(new Student(202,"Suresh",LocalDate.of(1997, 8,4),75)); 		
	this.studentList.add(new Student(203,"Mahesh",LocalDate.of(1997, 9,9),74)); 		
	this.studentList.add(new Student(204,"Ganesh",LocalDate.of(1997, 5,8),84)); 		
	this.studentList.add(new Student(205,"Ramesh",LocalDate.of(1997, 5,2),60)); 		 
	}
	public List<Student> userFilter(){ 		
		return  this.studentList.stream().filter(e -> e.getMarkScored()>70).collect(Collectors.toList()); 	
		} 
	
	public List<Student> userFilter(Predicate<Student> predicate){ 		
		return  this.studentList.stream().
				filter(predicate).collect(Collectors.toList());
	}
	 public Map<String,Double> transformToMap(){
  	   
  	   return this.studentList.stream().filter(e -> e.getMarkScored()>70)
  			   .collect(Collectors.toMap(Student::getStudentName,Student::getMarkScored));
     }
	 
	 public List<String> getStudentNames(){
		 return this.studentList.stream().
				 filter(e -> e.getMarkScored()>70)
				 .map(e -> e.getStudentName())
				 .collect(Collectors.toList());
	 }
	 public Set<Student> sortedByName(){
		TreeSet<Student> list=this.studentList.stream()
				.sorted().collect(Collectors.toCollection(TreeSet::new));
		
		
		return list;
				
		 
	 }
	 public double highesMark() {
		 Optional<Student> value = this.studentList.stream().
				 max(Comparator.comparing(Student::getMarkScored));
		 
		 double max =0;
		 if(value.isPresent()) {
		            max =value.get().getMarkScored();
		        }
		  return max;
			
	 }
	 }
