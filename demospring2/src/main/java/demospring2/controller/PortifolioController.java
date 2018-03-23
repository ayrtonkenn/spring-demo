package demospring2.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import demospring2.service.PortifolioService;

@Controller

public class PortifolioController {
	private PortifolioService service;
	
	@GetMapping(value="/")
	public ResponseEntity<String> getIntial() {
		return new ResponseEntity<String>("Hello World", HttpStatus.ACCEPTED);
	}
	
	@PostMapping
	public String postPortif() {
		return service.add();
	}
	@GetMapping
	public String getByID() {
		return null;
	}
	
	@PutMapping
	public HttpEntity<String> editPortif() {
		return null;
	}
	
	
	
	
}
