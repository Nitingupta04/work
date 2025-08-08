package com.jtcindia.springproject;

public class A {

	String msg;

	public void setMsg(String msg) {
		System.out.println("-- setMsg inside class A --");
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "-- toString () in class A --";
	}

}
