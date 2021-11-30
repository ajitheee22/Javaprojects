package com.git.main;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Maincontroller {

	
	
	@GetMapping("/")
	public String mainmethod() {
		
		
		return "Hey welcome to REST";
		
	}
}
