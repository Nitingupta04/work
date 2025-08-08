package com.jtcindia.springproject;

public class B {
	String str;

	public B(String str) {
		System.out.println("-- Param cons inside class B --");
		this.str = str;
	}

	@Override
	public String toString() {
		return "-- toString () in class B --";
	}

}
