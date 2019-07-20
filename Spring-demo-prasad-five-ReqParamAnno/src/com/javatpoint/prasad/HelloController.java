package com.javatpoint.prasad;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String display(@RequestParam("username") String username, @RequestParam("password") String password, Model m ) {
		
		if(password.equals("kada")) {
			String msg="Welcome "+username+" ur password is::: "+password;
			m.addAttribute("message",msg);
			return "successpage";

		}
		else {
			String msg="hello "+username+" u have enterd a wrong password! Please enter the correct password";
			m.addAttribute("message",msg);
			return "errorpage";
		}
		
	}
	
}
