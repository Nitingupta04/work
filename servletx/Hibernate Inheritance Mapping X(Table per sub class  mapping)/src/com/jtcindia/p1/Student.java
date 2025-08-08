package com.jtcindia.p1;

public class Student {

	private int sid;
	private String sname;
	private String email;
	private int phone;

	public Student() {
		System.out.println("-- Default Cons. --");
	}

	public Student(String sname, String email, int phone) {
		super();
		System.out.println("-- Param Cons. --");
		this.sname = sname;
		this.email = email;
		this.phone = phone;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

}
