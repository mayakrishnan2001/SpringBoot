package com.example.wipro;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@RequestMapping("/")
	public static String sayWelcome() {
		return "Welcome";
	}
	
	@RequestMapping("/bankname")
	public String bankName() {
		return "State Bank";
	}
	
	@RequestMapping("/address")
	public String address() {
		return "1090 A.R.COMPLEX, POONAMALLEE HIGH RD, POONAMALLEE HIGH RD, near MALAI MALAR BUILDING, Chennai, Tamil Nadu 600084";
	}

}
