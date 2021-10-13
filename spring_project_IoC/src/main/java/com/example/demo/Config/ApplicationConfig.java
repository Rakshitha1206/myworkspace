package com.example.demo.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.example.demo.entity.copy.Student;
@Configuration
public class ApplicationConfig {

	@Bean
	
	public Student ram() {
		return new Student(101,"Ramesh",98,"ramesh@abc");
	}
	@Bean
	
	
	public Student shyam() {
		return new Student(102,"Shyam",87,"shyam@abc");
	}
	@Bean
	
	public Student bama() {
		return new Student(103,"bama",91,"bama@abc");
	}
	
}
