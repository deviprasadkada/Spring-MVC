package com.javatpoint.prasad;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javatpoint.model.LoginForm;

@Controller
@RequestMapping("/login")
public class LoginController {

	@RequestMapping(method=RequestMethod.GET)
	public String loadLoginForm(Map model) {
		
		LoginForm loginForm=new LoginForm();
		model.put("loginForm", loginForm);
		return "login";
	}
	
	
}
