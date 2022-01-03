package com.example.SB1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	@RequestMapping("/welcome")
	public String sayWelcome() {
		return "<h1>Welcome to Spring Boot.....</h1>";
	}
}
