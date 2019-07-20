package com.javatpoint.prasad;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	
	@RequestMapping("/")
	public String show() {
		return "index";
	}
	
	
	@RequestMapping("/hello")
	public String redirect() {
		return "viewpage";
	}
	
	
	@RequestMapping("/helloagain")
	public String display() {
		return "final";
	}
	@RequestMapping("/modeview")
	public ModelAndView sayHello() {
		String message="welcome to spring mvc";
		return new ModelAndView("hello","welcomeMessage",message);
	}
	
}
