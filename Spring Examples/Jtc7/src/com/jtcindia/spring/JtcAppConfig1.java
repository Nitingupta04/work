package com.jtcindia.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

@Configuration
@ImportResource({ "jtc1.xml", "jtc2.xml" })
public class JtcAppConfig1 {

	@Scope("prototype")
	@Bean("ao")
	public A createA() {
		System.out.println("-- Here A Bean started --");
		A ao = new A();
		ao.setA(111);
		ao.setMsg("A-Bean");
		return ao;
	}

	@Scope("prototype")
	@Bean("bo")
	public B createB() {
		System.out.println("-- Here B Bean started --");
		B bo = new B(222, "B-Bean");
		bo.showB();
		return bo;
	}
}