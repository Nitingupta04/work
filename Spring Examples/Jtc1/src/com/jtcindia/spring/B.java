package com.jtcindia.spring;

public class B {

	int b;
	String str;

	public B(int b, String str) {
		System.out.println("-- Param Cons in class B --");
		this.b = b;
		this.str = str;
	}

	@Override
	public String toString() {
		System.out.println("-- toString () inside the class B --");
		return "B [b=" + b + ", str=" + str + "]";
	}

	void m2() {
		System.out.println("-- m2 () inside the class B --");
		
	}

}
