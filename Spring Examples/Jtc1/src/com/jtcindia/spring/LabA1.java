package com.jtcindia.spring;

public class LabA1 {
	public static void main(String[] args) {
		
		A a1 = new A();
		a1.setA(10);
		a1.setMsg("Class A");
		a1.m1();
		a1.toString();
		
		
		B b1 = new B(20,"Class B");
		b1.m2();
		b1.toString();
		
		Hello h1 = new Hello(a1, b1);
		System.out.println("-- Here we are creating the object for the hello class --");
		h1.showHello();
	}

}
