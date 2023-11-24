package com.boot.exception.handling.service;

import org.springframework.stereotype.Service;

import com.boot.exception.handling.global.handlers.NoBookFoundException;

@Service
public class BookServiceImpl implements BookService{

	@Override
	public Double findBookPriceById(String id) {
		if(id.equalsIgnoreCase("B101"))
			return 450.0;
		else
			throw new  NoBookFoundException("With Given Id book was not found"+id);
	}

}
