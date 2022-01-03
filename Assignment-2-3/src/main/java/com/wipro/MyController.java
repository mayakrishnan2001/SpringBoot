package com.wipro;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("/branches")
	public String bankname() {
		return "branches";
	}
	
	@RequestMapping("/services")
	public String services() {
		return "services";
	}

}
