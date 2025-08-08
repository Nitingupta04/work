package com.jtcindia.springprojects;

public class Hello {

	static Hello hello = null;

	static {
		System.out.println("-- Static block inside Hello class --");
		hello = new Hello();
	}

	private Hello() {
		System.out.println("-- Def cons inside Hello class --");
	}

	public static Hello getHello() {
		System.out.println("-- getHello () inside Hello class --");
		return hello;
	}

	public static void setHello(Hello hello) {
		System.out.println("-- setHello () inside Hello class --");
		Hello.hello = hello;
	}
	
	void showHello() {
		System.out.println("-- showHello() inside class Hello --");
	}

}
