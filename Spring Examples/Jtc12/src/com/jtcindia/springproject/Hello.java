package com.jtcindia.springproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Hello {

	@Autowired(required = false)
	@Qualifier("myhai")
	Hai hai;

	void showHello() {
		System.out.println("-- showHello() inside Hello Bean --");
		System.out.println(hai);
	}

}
