package com.jtcindia.springhome;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JtcHome {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JtcAppConfig.class);
		System.out.println("-- Container is Ready --");
		Hello hello = (Hello) ctx.getBean("hello");
		hello.showHello();
	}
}
