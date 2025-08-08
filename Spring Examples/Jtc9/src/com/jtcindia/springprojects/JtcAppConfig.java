package com.jtcindia.springprojects;

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

//	@Bean(name = "hai1")
//	public Hai createHai1() {
//		System.err.println("-- Inside create Hai1 () --");
//		Hai hai = new Hai();
//		return hai;
//	}

	@Bean(name = "hello")
	public Hello createHello(Hai hai1) {
		Hello h = new Hello();
		h.setHai1(hai1);
		return h;
	}

}
