package com.jtcindia.springprojects;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class JtcAppConfig {

	@Scope("prototype")
	@Bean("Hello")
	public Hello createHello() {
		Hello h1 = Hello.getHello();
		return h1;
	}

	@Scope("prototype")
	@Bean("Hai")	
	public Hai createHai() {
		Hai hai = new Hai();
		return hai;
	}

	@Scope("prototype")
	@Bean("Runtime")
	public Runtime createRuntime() {
		Runtime r = Runtime.getRuntime();
		return r;
	}

}
