package com.jtcindia.springproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JtcAppConfig {

	@Bean(name = "myhai")
	public Hai createHai() {
		Hai hai = new Hai();
		return hai;
	}

	@Bean(name = "hello")
	public Hello createHello() {
		return new Hello();
	}

}
