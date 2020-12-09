package com.mine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component  //when we use this spring create one object in spring container with default name
public class Alien {

	private int aid;
	private String aname;
	@Autowired  //It search in container for getting object of laptop
	@Qualifier("lap")  //search by name
	private Laptop laptop;
	
	
	public Alien() {
		super();
		System.out.println("Object Created for Alien!!");
	}
	public void show() {
		System.out.println("Inside Show Method!");
		laptop.compile();
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + "]";
	}
	
}
