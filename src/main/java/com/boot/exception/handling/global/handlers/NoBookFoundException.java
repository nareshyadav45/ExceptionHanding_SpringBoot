package com.boot.exception.handling.global.handlers;


public class NoBookFoundException extends RuntimeException {
 public NoBookFoundException(String message) {
	super(message);
}
}
