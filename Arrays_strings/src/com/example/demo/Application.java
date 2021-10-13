package com.example.demo;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student ram = new Student(102,"ram",80,"ram@abc.com");
        Student shyam = new Student(103,"shyam",98,"shyam@abc.com");
        Student ganesh = new Student(104,"ganesh",83,"ganesh@abc.com");
        Student ramesh = new Student(105,"ramesh",90,"ramesh@abc.com");
        StudentService service = new StudentService();
        
        service.addStudent(ram);
        service.addStudent(ganesh);
        service.addStudent(shyam);
        service.addStudent(ramesh);
        
        Student[] list = service.getStudList();
        
        for(Student eachStudent:list)
        {
        	System.out.println(eachStudent.getStudentName());
        }
        
        
        
	}

}
