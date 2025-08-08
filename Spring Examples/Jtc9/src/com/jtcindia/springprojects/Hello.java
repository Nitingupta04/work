package com.jtcindia.springprojects;

public class Hello {

	Hai hai;  // Explicit Wiring

	public Hello() {
		System.out.println("-- Def cons inside Hello --");
	}	

	public void setHai1(Hai hai) {
		System.out.println("-- setHai inside Hello --");
		this.hai = hai;
	}

	public void showHello() {
		System.out.println("-- showHello () inside Hello class");
		System.out.println("-- Value of hai = "+hai);
	}

}
