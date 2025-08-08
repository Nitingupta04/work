package com.jtcindia.springproject;

public class Account {

	private int accountno;
	private String accounttype;
	private double accountbal;

	public Account() {
		System.out.println("-- Def cons inside Account class --");
	}

	public Account(int accountno, String accounttype, double accountbal) {
		System.out.println("-- Param cons inside Account class --");
		this.accountno = accountno;
		this.accounttype = accounttype;
		this.accountbal = accountbal;
	}

	@Override
	public String toString() {
		System.out.println("-- toString() inside Account class --");
		return "Account [accountno=" + accountno + ", accounttype=" + accounttype + ", accountbal=" + accountbal + "]";
	}

}
