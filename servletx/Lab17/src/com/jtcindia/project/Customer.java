package com.jtcindia.project;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "my__customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cid")
	private int cid;

	@Column(name = "cname")
	private String cname;

	@Column(name = "myemail")
	private String myemail;

	@Column(name = "phoneno")
	private int phoneno;

	// Cons
	public Customer() {
		System.out.println("-- Default Cons --");
	}

	// Param Cons
	public Customer(String cname, String myemail, int phoneno) {
		super();
		System.out.println("-- Param Cons --");
		this.cname = cname;
		this.myemail = myemail;
		this.phoneno = phoneno;
	}

	// Setter and Getter

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getMyemail() {
		return myemail;
	}

	public void setMyemail(String myemail) {
		this.myemail = myemail;
	}

	public int getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}

	// toString()
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", myemail=" + myemail + ", phoneno=" + phoneno + "]";
	}

}
