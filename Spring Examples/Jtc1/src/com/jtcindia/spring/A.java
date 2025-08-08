package com.jtcindia.spring;

public class A {
	int a;
	String msg;

	// setter 
	public void setA(int a) {
		this.a = a;
		System.out.println("-- Set of a in class A --");
	}

	public void setMsg(String msg) {
		this.msg = msg;
		System.out.println("-- Set of msg in class A --");
	}

	// cons

	public A() {
		System.out.println("-- Def cons inside class A --");
	}

	// m1 ()
	void m1() {
		System.out.println("-- m1 () inside the class A --");
	}

	// toString
	@Override
	public String toString() {
		System.out.println("-- toString () inside class A --");
		return "A [a=" + a + ", msg=" + msg + "]";
	}

}