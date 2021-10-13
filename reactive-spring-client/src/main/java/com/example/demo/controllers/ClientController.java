package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.demo.entity.Student;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(path="/client/students")
public class ClientController {
private WebClient client;
private static String uri="http://localhost:8081/api/v1/students";
@Autowired
public void setClient(WebClient client) {
this.client=client;
}
@GetMapping
public Flux<String> getAllStudents(){
return client.get().uri(uri).retrieve().bodyToFlux(String.class);
}
@GetMapping(path="/{rollNumber}")
public Mono<String> getStudentByRoll(@PathVariable("rollNumber") int rollNumber){
return client.get().uri(uri+"/{rollNumber}").retrieve().bodyToMono(String.class);
}

//@PostMapping
//public Mono<Student> addStudent(@RequestBody Student entity){
//	return client.post().uri(uri)
//			.body(Mono.just(entity),Student.class);
//	         .retrieve()
//	         .bodyToMono(Student.class);
//	
//
//}
}
