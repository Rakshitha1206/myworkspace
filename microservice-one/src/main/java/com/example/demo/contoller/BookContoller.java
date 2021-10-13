package com.example.demo.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookContoller {

	@GetMapping(path="/books")
	public String getBooks() {
		return "Head first Java";
	}
}
