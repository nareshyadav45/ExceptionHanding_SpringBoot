package com.boot.exception.handling.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ResonseController {

	@RequestMapping(value = "/response")
	public String responseMessage(Model model) {
		model.addAttribute("thankyou", "thanks for learning exception handling mechanism globally");
       int j=90/0;
		return "thanks";

	}

}
