package com.jtcindia.spring;

public class Hello {

	A aobj;
	B bobj;
	
	public Hello() {
		System.out.println("-- Defa cons  inside class Hello --");
	}
	
	public Hello(A aobj, B bobj) {
		System.out.println("-- Param cons inside class Hello --");
		this.aobj = aobj;
		this.bobj = bobj;
	}

	void showHello() {
		System.out.println("-- showHello() inside the class Hello --");
		System.out.println("-- Calling m1() inside showHello() --");
		aobj.m1();
		System.out.println("-- Calling m2() inside showHello() --");
		bobj.m2();
	}

}
