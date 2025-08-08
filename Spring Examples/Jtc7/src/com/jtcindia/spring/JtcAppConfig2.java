package com.jtcindia.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class JtcAppConfig2 {
	@Scope("prototype")
	@Bean("hello")
	public Hello createHello(A ao, B bo) {
		System.out.println("-- Here Hello Bean started --");
		Hello h1 = new Hello(ao, bo);
		h1.showHello();
		return h1;
	}

}
