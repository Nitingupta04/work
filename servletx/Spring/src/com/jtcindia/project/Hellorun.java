package com.jtcindia.project;

class A {

	void m1() {
		System.out.println("-- m1 () in class A --");
	}
}

class B {

	void m2() {
		System.out.println("-- m2 () in class B --");
	}
}

class Hello {
	
	void show() {
		System.out.println("-- show() in class Hello --");
	}

	static {
		A a1 = new A();
		B b1 = new B();
		a1.m1();
		b1.m2();
	}
}
 
public class Hellorun {

	public static void main(String[] args) {
		Hello h1 = new Hello();
		h1.show();
	}

}
