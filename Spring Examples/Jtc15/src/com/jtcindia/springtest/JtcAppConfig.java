package com.jtcindia.springtest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JtcAppConfig {

	@Bean(name = "hai")
	public Hai createHai() {
		Hai hai = new Hai();
		hai.setMsg("-- Hai inside hai bean --");
		return hai;
	}

	@Bean(name = "hello" , initMethod = "init" , destroyMethod = "destroy")
	public Hello createHello() {
		Hello hello = new Hello();
		return hello;
	}	

}
