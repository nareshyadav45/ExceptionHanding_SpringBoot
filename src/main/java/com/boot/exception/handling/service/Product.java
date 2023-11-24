package com.boot.exception.handling.service;

public class Product {
private int id;
private String description;
private Double price;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Product [id=" + id + ", description=" + description + ", price=" + price + "]";
}
public Product(int id, String description, Double price) {
	super();
	this.id = id;
	this.description = description;
	this.price = price;
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}



}
