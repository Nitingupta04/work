package com.jtcindia.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class JtcAppConfig3 {

	@Scope("prototype")
	@Bean("hai")
	public Hai createHai() {
		System.out.println("-- Here Hai Bean started --");
		Hai hai = new Hai();
		hai.showHai();
		return hai;
	}

}
