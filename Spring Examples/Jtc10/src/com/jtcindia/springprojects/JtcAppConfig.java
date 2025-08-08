package com.jtcindia.springprojects;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class JtcAppConfig {

	@Bean(name = "hai")
	public Hai createHai() {
		System.err.println("-- Inside create Hai () --");
		Hai hai = new Hai();
		return hai;
	}

//	@Bean(name = "myhai1")
//	public Hai createHai1() {
//		System.err.println("-- Inside create Hai1 () --");
//		Hai hai = new Hai();
//		return hai;
//	}

	@Bean(name = "hello", autowire = Autowire.BY_TYPE)
	public Hello createHello() {
		System.err.println("-- Inside create Hello () --");
		Hello h = new Hello();
		return h;
	}

}
