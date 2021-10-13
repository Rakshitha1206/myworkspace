package com.example.demo;

public class StudentService {
     private Student[] studList;
     private static int maxSize =3;
     private static int count=0;
     
     public StudentService(Student[] studList) {
    	 super();
    	 this.studList = studList;
     }
     public StudentService() {
    	 super();
    	 this.studList=new Student[3];
     }
     public boolean addStudent(Student student) {
    	 if(count==maxSize) {
    		 
    		 System.out.println("Array Size is full");
    		 return false;
    	 } 
    	 else {
    		 this.studList[count] = student;
        	 count++; 
        	 return true;
    		 
    	 }
    	
    	 
		
     }
     public Student[] getStudList() {
    	 return this.studList;
     }
}
