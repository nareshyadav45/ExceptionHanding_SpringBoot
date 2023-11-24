package com.boot.exception.handling.global.handlers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestController
@RestControllerAdvice
public class RestExceptionHandling {

	
	@ExceptionHandler(value = NoProductFoundException.class)
	public ResponseEntity<ApiErrorResponse> handleNoProductFoundException(){
		ApiErrorResponse reponse=new ApiErrorResponse(400,"Product Not Found With Given Id");
		return new ResponseEntity<ApiErrorResponse>(reponse, HttpStatus.NOT_FOUND);
	}
	
	
	
}
