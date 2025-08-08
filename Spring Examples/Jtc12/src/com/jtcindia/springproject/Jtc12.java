package com.jtcindia.springproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Jtc12 {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JtcAppConfig.class);
		System.out.println("-- Container is Ready --");
		System.out.println("-- Here we are calling Hello Bean --");
		Hello hello = (Hello) ctx.getBean("hello");
		hello.showHello();
	}

}
