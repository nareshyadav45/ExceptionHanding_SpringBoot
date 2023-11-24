package com.boot.exception.handling.service;

import org.springframework.stereotype.Service;

import com.boot.exception.handling.global.handlers.NoProductFoundException;

@Service
public class ProductServiceImpl implements ProductService {

	@Override
	public Product getProductById(int id) {
		if(id==101)
			return new Product(101,"New product" , 900.0);
		else
			throw new NoProductFoundException("with given id Product not fount "+id);
		
	}

}
