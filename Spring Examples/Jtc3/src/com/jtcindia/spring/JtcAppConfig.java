package com.jtcindia.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class JtcAppConfig {

	@Bean("hello")
	//@Scope("prototype")
	@Lazy(false)
	public Hello createHello() {
		Hello h1 = new Hello();
		System.out.println("Hello Created");
		return h1;
	}

	@Bean("hai")
	//@Scope("prototype")
	@Lazy(false)
	public Hai createHai() {
		Hai hi1 = new Hai();
		System.out.println("Hai Created");
		return hi1;
	}

}
