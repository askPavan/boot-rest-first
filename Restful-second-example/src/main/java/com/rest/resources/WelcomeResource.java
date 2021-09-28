package com.rest.resources;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class WelcomeResource {

	@GetMapping("/welcome")
	public ResponseEntity<String> welcome(){
		String str = "Welcome RESTful Services....";
		return new ResponseEntity<>(str, HttpStatus.OK);
	}
	
	@GetMapping("/home")
	public ResponseEntity<String> home(){
		String str = "Welcome RESTful services home...";
		return new ResponseEntity<>(str, HttpStatus.OK);
	}
}
