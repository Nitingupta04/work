package com.jtcindia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Jtc3 {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JtcAppConfig.class);
		System.out.println("-- Here container start runing --");

		// Hello 
		Hello h = (Hello) ctx.getBean("hello");
		Hello h1 = (Hello) ctx.getBean("hello");
		System.out.println("-- compair h == h1" + (h==h1));		
		//Hai hai = (Hai) ctx.getBean("hai");
	}
}
