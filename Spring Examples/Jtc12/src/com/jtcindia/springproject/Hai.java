package com.jtcindia.springproject;

public class Hai {

	String msg;

	public void setMsg(String msg) {
		this.msg = msg;
		System.out.println("-- setMsg inside class Hai --");
	}

	@Override
	public String toString() {
		return "-- Hai Bean --";
	}

}
