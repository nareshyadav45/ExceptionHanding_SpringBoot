package com.boot.exception.handling.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.boot.exception.handling.service.BookService;

@Controller
public class BookController {
	@Autowired
	private BookService bookService;
	

	@RequestMapping(value = "/book")
	public String book(@RequestParam("id") String id,Model model) {
		Double book= this.bookService.findBookPriceById(id);
		model.addAttribute("msg","With Given ID BOOK FOUND AND PRICE IS :"+book );
		return "book";
		
		
	}
	
}
