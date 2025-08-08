package com.jtcindia.springprojects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Jtc4 {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JtcAppConfig.class);
		System.err.println("-- Spring container is Ready --");
		System.out.println("-- Calling Hello Bean --");
		Hello h1 = (Hello) ctx.getBean("Hello");
		Hello h2 = (Hello) ctx.getBean("Hello");
		System.out.println("-- h1==h2" + "  " + (h1 == h2));
		h1.showHello();
		System.out.println("-- Calling Runtime Bean --");
		Runtime r = (Runtime) ctx.getBean("Runtime");
		System.out.println("-- Calling Hai Bean --");
		Hai hai1 = (Hai) ctx.getBean("Hai");
		Hai hai2 = (Hai) ctx.getBean("Hai");
		System.out.println("-- **hai1==hai2" + "  " + (hai1 == hai2));
		hai1.showHai();
	}

}
