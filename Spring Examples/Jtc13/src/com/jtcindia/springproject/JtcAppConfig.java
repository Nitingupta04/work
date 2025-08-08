package com.jtcindia.springproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class JtcAppConfig {

	@Scope("prototype")
	@Bean(name = "ao")
	public A createA() {
		A a1 = new A();
		a1.setMsg("-- A --");
		return a1;
	}

	@Scope("prototype")
	@Bean(name = "bo")
	public B createB() {
		B b1 = new B("-- B --");
		return b1;
	}

	@Scope("prototype")
	@Bean(name = "hello")
	public Hello createHello() {
		System.out.println("-- Hello bean started runing --");
		Hello h1 = new Hello();
		return h1;
	}

}
