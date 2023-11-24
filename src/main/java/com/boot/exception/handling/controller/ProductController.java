package com.boot.exception.handling.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Producer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.boot.exception.handling.service.Product;
import com.boot.exception.handling.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping(value="/product",produces= {"application/json"})
	public ResponseEntity<Product> getProductById(@RequestParam("id") String id){
		Product product= this.productService.getProductById(Integer.parseInt(id));
		return new ResponseEntity<>(product,HttpStatus.FOUND);
		
	}
	
}
