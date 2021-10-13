package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.copy.Student;
import com.example.demo.entity.copy.StudentList;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

@SpringBootApplication
public class SpringProjectIoCApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext txt= SpringApplication.run(SpringProjectIoCApplication.class, args);
		
		
		StudentList list = txt.getBean(StudentList.class);
//		List<Student> var = list.getStudList();
//		list.getStudList().forEach(System.out::println);
		
		System.out.println("is Singleton=" +txt.isSingleton("studList"));
	   System.out.println("is Prototype="+txt.isPrototype("studList"));
////		
		
//		Student val = list.getStud();
//		System.out.println(val);
				
		
		txt.close();
	}

}
