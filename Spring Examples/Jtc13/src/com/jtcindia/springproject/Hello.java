package com.jtcindia.springproject;

import org.springframework.beans.factory.annotation.Autowired;

public class Hello {

	A aobj;
	B bobj;

	@Autowired
	public void setAobj(A aobj) {
		System.out.println("-- setAobj inside Hello --");
		this.aobj = aobj;
	}

	@Autowired
	public void setBobj(B bobj) {
		System.out.println("-- setBobj inside Hello --");
		this.bobj = bobj;
	}

	void showHello() {
		System.out.println("-- show () inside class Hello --");
		System.out.println(aobj);
		System.out.println(bobj);
	}

}
