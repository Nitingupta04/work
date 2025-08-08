package com.jtcindia.springhome;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JtcAppConfig {

	@Bean(name = "hai")
	public Hai createHai() {
		Hai hai = new Hai();
		hai.setMsg("-- Inside Hai Bean --");
		return hai;
	}

	@Bean(name = "hello")
	public Hello createHello() {
		Hello hello = new Hello();
		return hello;
	}
	
}
