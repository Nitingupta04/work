package com.jtcindia.springproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Jtc8 {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JtcAppConfig.class);
		System.err.println(" -- Container is Ready --");

		Customer cus = (Customer) ctx.getBean("customers");
		System.out.println("-- All the value inside Customer  " + cus);

		System.out.println("-- All the value inside Account  " + ctx.getBean("myaccounts"));
		
		System.out.println("-- All the value inside Address  " + ctx.getBean("myaddress"));
		
	}
}
