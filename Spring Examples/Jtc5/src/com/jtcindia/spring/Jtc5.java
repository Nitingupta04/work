package com.jtcindia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Jtc5 {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(JtcAppConfig1.class, JtcAppConfig2.class,
				JtcAppConfig3.class);
		System.err.println("-- Here Container is Ready --");

		System.err.println("-- calling A bean --");
		A ao = (A) ctx.getBean("ao");
		ao.showA();

		System.err.println("-- calling B bean --");
		B bo = (B) ctx.getBean("bo");
		bo.showB();

		System.err.println("-- calling Hello bean --");
		Hello hello = (Hello) ctx.getBean("hello");
		hello.showHello();

		System.err.println("-- calling Hai bean --");
		Hai hai = (Hai) ctx.getBean("hai");
		hai.showHai();
	}

}
