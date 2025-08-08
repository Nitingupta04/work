package com.jtcindia.springtest;

public class Hai {

	String msg;

	public Hai() {
		System.out.println("-- Delft cons inside class Hai --");
	}

	public void setMsg(String msg) {
		System.out.println("-- Setter mtd inside class Hai --");
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "-- toString () inside class Hai --";
	}
}
