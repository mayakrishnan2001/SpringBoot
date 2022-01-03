package com.example.SB1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String sayHello() {
		return "welcome";  	//viewname
	}
	
	@RequestMapping("/emp")
	public ModelAndView details() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("company","wipro");
		mv.setViewName("details");
		return mv;
	}
	
	@PostMapping("/band")
	public String show(String band,Model m) {
		System.out.println(band);
		m.addAttribute("empinfo",band);
		return "empband";    //logical viewname
	}
}
