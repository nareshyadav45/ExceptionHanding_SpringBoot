package com.boot.exception.handling.global.handlers;


public class ApiErrorResponse {
private int statusCode;
private String discription;
public ApiErrorResponse() {
	super();
	// TODO Auto-generated constructor stub
}
public ApiErrorResponse(int statusCode, String discription) {
	super();
	this.statusCode = statusCode;
	this.discription = discription;
}
public int getStatusCode() {
	return statusCode;
}
public void setStatusCode(int statusCode) {
	this.statusCode = statusCode;
}
public String getDiscription() {
	return discription;
}
public void setDiscription(String discription) {
	this.discription = discription;
}
}
