package com.jtcindia.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class JtcAppConfig {

	@Bean("ao")
	@Scope("prototype")
	public A createA() {
		System.out.println("-- Here A Bean started --");
		A ao = new A();
		ao.setA(111);
		ao.setMsg("A-Bean");
		ao.m1();
		return ao;
	}

	@Bean("bo")
	public B createB() {
		System.out.println("-- Here B Bean started --");
		B bo = new B(222, "B-Bean");
		bo.m2();
		return bo;
	}

}