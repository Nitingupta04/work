package com.jtcindia.spring;

public class B {

	int b;
	String str;

	public B(int b, String str) {		
		System.out.println("-- Param Cons in class B --");
		this.b = b;
		this.str = str;
	}

	void showB() {
		System.out.println("-- ShowB () inside the class B --");
		System.out.println("value of b in class B " + b);
		System.out.println("-- value of str in class B" + str);
	}

}
