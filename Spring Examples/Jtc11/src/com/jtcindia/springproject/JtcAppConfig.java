package com.jtcindia.springproject;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class JtcAppConfig {

//	@Bean("a0")
//	public A createA() {
//		A a1 = new A();
//		return a1;
//	}

	@Scope("prototype")
	@Bean("bo")
	public B createB() {
		System.err.println("-- Inside B Bean --");
		B b1 = new B();
		return b1;
	}

	@Scope("prototype")
	@Bean(name = "customerdao")
	public CustomerDAO createCustomerDAO() {
		System.err.println("-- Inside CustomerDAO Bean --");
		CustomerDAO dao = new CustomerDAOImpl();
		return dao;
	}

	@Scope("prototype")
	//@Scope("singleton")
	@Bean(name ="hello", autowire = Autowire.BY_TYPE)
	public Hello createHello() {
		System.err.println("-- Inside Hello Bean --");
		Hello h = new Hello();
		return h;
	}

}
