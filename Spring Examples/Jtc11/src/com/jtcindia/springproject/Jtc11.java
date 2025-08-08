//Injecting subtype to supertype

package com.jtcindia.springproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Jtc11 {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JtcAppConfig.class);
		System.out.println("-- Container is Ready for Runing --");
		System.out.println("-- Calling Hello Bean --");
		Hello hello = (Hello) ctx.getBean("hello");
		hello.helloShow();
		
		//System.err.println("-- Hashcode for hello =" + hello.hashCode());

//		System.out.println("--------------------");
//		Hello hello1 = (Hello) ctx.getBean("hello");
//		hello1.helloShow();
//		System.err.println("-- Hashcode for hello1 = " + hello1.hashCode());
//		System.out.println("hello == hello1 = " + (hello == hello1));
	}
}
