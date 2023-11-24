package com.boot.exception.handling.global.handlers;

public class NoProductFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8253268953003182742L;

	public NoProductFoundException(String message) {
		super(message);
	}

}
