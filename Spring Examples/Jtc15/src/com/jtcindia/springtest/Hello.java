package com.jtcindia.springtest;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.security.auth.Destroyable;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

public class Hello implements InitializingBean,Destroyable{

	@Autowired
	Hai hai;

	public void setHai(Hai hai) {
		System.out.println("-- setHai inside class Hello --");
		this.hai = hai;
	}

	public Hello() {
		System.out.println("-- Deflt cons inside class Hello --");
	}

	public void showHello() {
		System.out.println("-- showHello () inside class Hello --");
		System.out.println("-- Value of Hai = " + hai);
	}

	@PreDestroy
	public void destroy() {
		System.out.println("-- destory () inside class Hello --");
	}

	@PostConstruct
	public void init() {
		System.out.println("-- init() inside class Hello --");
	}

	
	public void resource() {
		System.err.println("-- resource () inside class Hello --");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("-- after PropertiesSet () inside class Hello --");
	}

}
