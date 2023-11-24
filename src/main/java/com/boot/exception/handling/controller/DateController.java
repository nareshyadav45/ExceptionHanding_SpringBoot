package com.boot.exception.handling.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DateController {

	@RequestMapping(value ="/date")
	public String displayDate(Model model) {
		model.addAttribute("msg", "Today's date "+new Date());
		String str=null;
		str.length();
		return "date";
		
	}
	
	
	
	
	
	
	
	
	
}
