package com.jtcindia.springproject;

public class Hello {

	A a1; //Explicit Wiring
	CustomerDAO cdao;

	public void setA1(A a1) {
		System.out.println("-- Seta1 inside class Hello --");
		this.a1 = a1;
		
	}

	public void setCdao(CustomerDAO cdao) {
		System.out.println("-- Setcdao inside class Hello --");
		this.cdao = cdao;
	}

	public void helloShow() {
		System.out.println("-- helloShow() inside class Hello --");
		System.out.println("a1 = " + a1);
		System.out.println("cdao = " + cdao);		
	}

}
