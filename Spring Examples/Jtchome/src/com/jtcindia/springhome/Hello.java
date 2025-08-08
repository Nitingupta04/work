package com.jtcindia.springhome;

import javax.annotation.Resource;

public class Hello {

	@Resource(name = "hai")
	Hai hai;

	public void setHai(Hai hai) {
		System.out.println("-- setHai inside class Hello --");
		this.hai = hai;
	}

	public Hello() {
		System.out.println("-- Defalt cons inside class Hello --");
	}

	public void showHello() {
		System.out.println("-- showHello() inside class Hello --");
		System.out.println("-- Value of Hai = " + hai);
	}

}
