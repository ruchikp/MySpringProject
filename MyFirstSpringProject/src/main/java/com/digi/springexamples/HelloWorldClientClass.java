package com.digi.springexamples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldClientClass {
	
	
	public static void main(String args[]){
		
		

		ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
	HelloWorldMessageService messageService = context.getBean("messageingServiceImpl", HelloWorldMessageService.class);
	System.out.println(messageService.getMessage());	
	}
	
	

}
