package com.digi.setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.digi.constructor.Customer;

public class Customermain {
	
	public static void main(String[] args){
		
		
		ApplicationContext context= new ClassPathXmlApplicationContext("app-settercontext.xml");
		
		
		Customer cust = (Customer)context.getBean("customer");
		
		System.out.println(cust);
	}

}
