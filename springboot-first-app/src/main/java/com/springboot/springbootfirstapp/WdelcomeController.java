package com.springboot.springbootfirstapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WdelcomeController {

	@GetMapping("/welcome")
	public String welcome() {
		return "Youhou ça marche, direct dans la console!";
	}
	
}
