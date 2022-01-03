package com.example.wipro;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("/hi")
	public String sayhi() {
		return "hi";
	}
	
}
