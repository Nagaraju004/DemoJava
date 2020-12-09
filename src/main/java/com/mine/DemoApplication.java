package com.mine;

import org.springframework.boot.SpringApplication;  
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;  
@SpringBootApplication  
public class DemoApplication   
{  
	public static void main(String[] args)   
	{  
		ConfigurableApplicationContext context=SpringApplication.run(DemoApplication.class, args); 
		System.out.println("Welcome!!!");
		
		Alien a=context.getBean(Alien.class);
		a.show();  //we didnt't create obj for alien spring auto created the obj
	}  
}  
