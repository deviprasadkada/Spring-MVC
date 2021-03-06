package com.javatpoint.prasad;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String display(HttpServletRequest req, Model m) {
		//return "index";
		//read the provided form data
		String name=req.getParameter("username");
		String pass=req.getParameter("password");
		if(pass.equals("admin")) {
			String msg="Hello"+name;
			//add a message to the model
			m.addAttribute("message",msg);
			return "loginsuccess";
		}
		else {
			String msg="sorry "+name+" incorrect password";
			m.addAttribute("message",msg);
			return "errorpage";
		}
		
	}
	
}
