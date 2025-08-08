package com.jtcindia.spring;

public class Hello {
	
	A aobj;
	B bobj;
	
	public Hello(A aobj, B bobj) {		
		this.aobj = aobj;
		this.bobj = bobj;
		System.out.println("-- Param cons inside class Hello --");
	}
	
	void showHello() {
		System.out.println("-- showHello() inside the class Hello --");
		System.out.println("-- Calling showA() inside showHello() --");
		aobj.showA();
		System.out.println("-- Calling showB() inside showHello() --");
		bobj.showB();
	}

}
