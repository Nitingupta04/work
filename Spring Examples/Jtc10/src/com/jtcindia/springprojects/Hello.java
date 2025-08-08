package com.jtcindia.springprojects;

public class Hello {

	Hai hai1;  

	public Hello() {
		System.out.println("-- Def cons inside Hello --");
	}	

	public void setHai1(Hai hai) {
		System.out.println("-- setHai inside Hello --");
		this.hai1 = hai;
	}

	public void showHello() {
		System.out.println("-- showHello () inside Hello class");
		System.out.println("-- Value of hai = "+hai1);
	}
}
