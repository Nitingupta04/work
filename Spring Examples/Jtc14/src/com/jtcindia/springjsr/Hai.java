package com.jtcindia.springjsr;

public class Hai {
	String msg;

	public void setMsg(String msg) {
		System.out.println("-- setMsg () inside class Hai --");
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "-- toString () inside Hai class -- ";
	}
}
