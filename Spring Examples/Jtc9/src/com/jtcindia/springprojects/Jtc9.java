package com.jtcindia.springprojects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Jtc9 {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JtcAppConfig.class);
		System.out.println("-- Spring container is Ready --");

		/*
		 * System.out.println("-- Here we are calling Hai Bean --"); Hai hai = (Hai)
		 * ctx.getBean("hai");
		 * 
		 */

		System.out.println("-- Here we are calling Hello Bean --");
		Hello hello = (Hello) ctx.getBean("hello");
		hello.showHello();
	}
}
