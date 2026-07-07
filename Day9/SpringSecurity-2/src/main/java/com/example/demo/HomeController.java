package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "Welocome you log in succesfully";
	}
	

	
	@GetMapping("/user")
	public String userPage() {
		return "Welcome to user";
	}
	
	
	@GetMapping("/admin")
	public String adminPage() {
		return "Welcome to Admin";
	}
	
	
	
}
