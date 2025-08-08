package com.jtcindia.springjsr;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class JtcAppConfig {

	@Bean(name = "hai")
	public Hai createHai() {
		Hai hai = new Hai();
		hai.setMsg("-- Hai Bean --");
		return hai;
	}

	@Bean(name = "hello", initMethod = "init", destroyMethod = "destroy")
	public Hello createHello() {
		return new Hello();
	}

}
