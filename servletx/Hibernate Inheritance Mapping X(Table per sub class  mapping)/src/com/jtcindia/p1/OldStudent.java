package com.jtcindia.p1;

public class OldStudent extends Student {

	private int sid;
	private double ossalary;
	private String ocompanyName;
	private String oemail;

	public OldStudent() {
		System.out.println("-- Defalut cons --");
	}

	public OldStudent(String sname, String email, int phone, int sid, double ossalary, String ocompanyName,
			String oemail) {
		super(sname, email, phone);
		this.sid = sid;
		this.ossalary = ossalary;
		this.ocompanyName = ocompanyName;
		this.oemail = oemail;
	}

	public OldStudent(int sid, double ossalary, String ocompanyName, String oemail) {
		super();
		System.out.println("-- Param Cons --");
		this.sid = sid;
		this.ossalary = ossalary;
		this.ocompanyName = ocompanyName;
		this.oemail = oemail;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public double getOssalary() {
		return ossalary;
	}

	public void setOssalary(double ossalary) {
		this.ossalary = ossalary;
	}

	public String getOcompanyName() {
		return ocompanyName;
	}

	public void setOcompanyName(String ocompanyName) {
		this.ocompanyName = ocompanyName;
	}

	public String getOemail() {
		return oemail;
	}

	public void setOemail(String oemail) {
		this.oemail = oemail;
	}
}
