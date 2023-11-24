package com.boot.exception.handling.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public  class WelcomeCnotroller {

	@RequestMapping(value = "/welcome")
	public String welcome(Model model) {
		model.addAttribute("msg", "welcome to Controller based handling ");
		model.addAttribute("data","controller based exception handling...");
		model.addAttribute("Exception", "Exceprion Handler Mechanism");
		String str=null;
		str.length();
		
		return "welcome";
		
	}
	
//	@ExceptionHandler(value=NullPointerException.class)
//	public String handleNullPointerException(Model model) {
//		model.addAttribute("errorMessage", "Error occured please try again after somne time....");
//		
//		return "errorPage";
//		
//	}
//	
	@RequestMapping(value = "/thankYou")
	public String thankYou(Model model) {
		model.addAttribute("thankyou", "thanks for using this  Controller based handling exception ");
		int m=10/0;
		
		return "thanks";
		
	}
	
//	@ExceptionHandler(value=ArithmeticException.class)
//	public String handleArithematicException(Model model) {
//		model.addAttribute("errorMessage", "Can't divide a num with zero, So please try again after somne time....");
//		
//		return "errorPageArthimatic";
//		
//	}
}
