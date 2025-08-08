package com.jtcindia.springjsr;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

public class Hello implements InitializingBean, DisposableBean {

	@Autowired
	Hai hai;

	public Hello() {
		System.out.println("-- Def cons inside class Hello --");
	}

	@PostConstruct
	public void init() {
		System.out.println("-- init () inside class Hello --");
	}

	public void destroy() {
		System.err.println("-- destroy () inside class Hello --");
	}

	public void showHello() {
		System.out.println("-- showHello () inside class Hello --");
		System.out.println("-- Value of Hai = " + hai);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("-- After adding Proprties () inside class Hello --");
	}

}
