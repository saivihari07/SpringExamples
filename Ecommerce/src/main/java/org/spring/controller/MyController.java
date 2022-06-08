package org.spring.controller;

import org.spring.dao.SignUpDao;
import org.spring.model.SignUp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private SignUpDao signUpDao;

	@GetMapping("/")
	public String hello() {
		return "hello-world";
	}

	@RequestMapping("/login1")
	public String login() {
		return "login";
	}

	@RequestMapping("/admin")
	public String admin() {
		return "admin";
	}

	@RequestMapping("/user")
	public String user() {
		return "user";
	}
	@RequestMapping("/accessDenied")
	public String error() {
		return "access-denied";
	}
	@GetMapping("/main")
	public String helloMain() {
		return "main";
	}
	

	@ResponseBody
	@GetMapping("/bye")
	public String bye() {
		return "Bye Bye";
	}

//	@RequestMapping("/signup")
//	public String signUp(Model model) {
//		SignUp signUp = new SignUp();
//		model.addAttribute("signup",signUp);
//		return "signup";
//	}

	@RequestMapping("/signup")
	public String signUp(@ModelAttribute("signup") SignUp signUp) {
		return "signup";
	}

	@RequestMapping("/process-signup")
	public String processSignUpData(SignUp signUp) {

		signUp.setPassword(passwordEncoder.encode(signUp.getPassword()));
		System.out.println(signUp);

		signUpDao.saveData(signUp);

		return "redirect:/login1";
	}

}
