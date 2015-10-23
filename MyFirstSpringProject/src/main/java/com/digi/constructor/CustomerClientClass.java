package com.digi.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerClientClass {
	
	public static void main(String[] args){
		
		
		ApplicationContext context= new ClassPathXmlApplicationContext("constructor-app-context.xml");
		
		
		Customer cust = (Customer)context.getBean("customer");
		
		System.out.println(cust);
		
	
	}

}
