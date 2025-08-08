package com.jtcindia.springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class Jtc15 {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(JtcAppConfig.class);
		System.out.println("-- Container is Ready for runing --");
		Hello hello = (Hello) ctx.getBean("hello");
		hello.showHello();
		ctx.close();
		ctx.registerShutdownHook();
	}
}

