package com.jtcindia.spring;

public class A {

	int a;
	String msg;

	{
		System.out.println("-- Instance block in class A --");
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		
		System.out.println("-- Set of A in class A --");
		this.a = a;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	void showA() {
		System.out.println("-- ShowA () inside the class A --");
		System.out.println("value of A in class A " + a);
		System.out.println("-- value of msg in class A" +msg);
	}

}