package com.boot.exception.handling.global.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
@ControllerAdvice
public class GlobalExceprionHandlers {

	@ExceptionHandler(value = NullPointerException.class)
	public String globalNullPointerExceptionHanlder(Model   model) {
		model.addAttribute("errorMessage", "can't perform any operations on null objects");
		return "errorPage";
		
	}
	
	@ExceptionHandler(value = ArithmeticException.class)
	public String globalArithematicExceptionsHandlers(Model model) {
		model.addAttribute("errorMessage", "Any number can't divide with zero");
		return "errorPageArthimatic";
	}
	@ExceptionHandler(value = NoBookFoundException.class)
	public String handleNoBookFoundException(Model model) {
		model.addAttribute("msg", "With Given Id Book Not found");
		return "NoBookException";
		
	}
	
}
