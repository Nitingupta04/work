//POJO class
package com.jtc.hibernate;

public class Customer {

	private String name;
	private String email;
	private long phone_no;
	private String city;
	private double bal;

	public Customer() {
		System.out.print("-- I am defalut cons --");

	}

	public Customer(String name, String email, long phone_no, String city, double bal) {
		// super();
		System.out.print("-- I am Param cons --");
		// this.cid = cid;
		this.name = name;
		this.email = email;
		this.phone_no = phone_no;
		this.city = city;
		this.bal = bal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

}
