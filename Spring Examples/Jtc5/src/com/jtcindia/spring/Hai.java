package com.jtcindia.spring;

public class Hai {
	
	A aobj;
	B bobj;	
	
	public A getAobj() {
		return aobj;
	}
	public void setAobj(A aobj) {
		this.aobj = aobj;
		System.out.println("-- setter of Aobj inside Hai --");
	}
	public B getBobj() {
		return bobj;
	}
	public void setBobj(B bobj) {
		this.bobj = bobj;
		System.out.println("-- setter of Bobj inside Hai --");
	}
	
	void showHai()
	{
		System.out.println("-- showHai() inside the class Hai --");
		System.out.println("-- Calling showA() inside showHai() --");
		aobj.showA();
		System.out.println("-- Calling showB() inside showHai() --");
		bobj.showB();
	}	
	

}
