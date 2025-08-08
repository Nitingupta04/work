package com.jtcindia.p1;

public class CurrentStudent extends Student {

	private int sid;
	private double feebal;
	private String timing;
	private String trainer;

	public CurrentStudent() {

	}

	public CurrentStudent(String sname, String email, int phone, int sid, double feebal, String timing,
			String trainer) {
		super(sname, email, phone);
		this.sid = sid;
		this.feebal = feebal;
		this.timing = timing;
		this.trainer = trainer;
	}

	public CurrentStudent(int sid, double feebal, String timing, String trainer) {
		super();
		this.sid = sid;
		this.feebal = feebal;
		this.timing = timing;
		this.trainer = trainer;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public double getFeebal() {
		return feebal;
	}

	public void setFeebal(double feebal) {
		this.feebal = feebal;
	}

	public String getTiming() {
		return timing;
	}

	public void setTiming(String timing) {
		this.timing = timing;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

}
