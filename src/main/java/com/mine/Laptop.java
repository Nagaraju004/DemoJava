package com.mine;

import org.springframework.stereotype.Component;

@Component("lap") //when we use this spring create one object in spring container with name lap
public class Laptop {

	private int lid;
	private String brand;
	
	public Laptop() {
		super();
		System.out.println("Object Createad for Laptop");
	}
	
	public void compile() {
		System.out.println("Compiling!!!");
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
}
