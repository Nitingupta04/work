package com.jtcindia.springjsr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Jtc14 {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(JtcAppConfig.class);
		System.out.println("-- Container is Ready --");		
		Hello h = (Hello)ctx.getBean("hello");
		h.showHello();
		ctx.close();
		ctx. registerShutdownHook();
	}

}
