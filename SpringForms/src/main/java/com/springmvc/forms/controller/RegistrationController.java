package com.springmvc.forms.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/userReg")
public class RegistrationController {
	
	@RequestMapping("/register")
	public String showRegisterForm(Model model) {
		
		Person person = new Person();
		model.addAttribute("userReg",person);
		
		return "user-register-page";
	}
}
