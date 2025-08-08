package com.jtcindia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Jtc1 {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(JtcAppConfig.class);
		System.out.println("-- Here the container start runing --");
		A ao = (A) ctx.getBean("ao");
		ao.m1();
		
		 A ao1 = (A) ctx.getBean("ao"); System.out.println(ao == ao1);
		 B bo = (B) ctx.getBean("bo");
		 System.out.println("-- B Bean calling inside the class Jtc1 --"); bo.m2();
		 
//		 Hello h1 = (Hello)ctx.getBean("Hello");
//		 System.out.println("-- Hello Bean calling inside the class Jtc1 --");
//		  h1.showHello();
		 

	}
}