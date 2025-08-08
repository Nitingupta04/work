package com.jtc.exceptionhandling4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

class Student {
	int sid;
	String sname;
	String scity;

	public Student(int sid, String sname, String scity) {
		this.sid = sid;
		this.sname = sname;
		this.scity = scity;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", scity=" + scity + "]";
	}
}

public class Jtc {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		for (int i = 0; i <= 10; i++) {
			a1.add(101 + i);
		}
		System.out.println("a1 :- " + a1);

		ArrayList a2 = new ArrayList();
		a2.add(201);
		a2.add(202);
		a2.add(203);
		a2.add(204);
//		a1.add(a2);
//		System.out.println("a2 with a1 values :- " + a1);
		System.out.println("Add All");
		a1.addAll(a2);
		System.out.println(a1);

		LinkedList l1 = new LinkedList();
		System.out.println(l1.size());
		System.out.println(l1);
		l1.add("First");
		l1.add(123);
		l1.add(new Student(101, "Nitin", "JBP"));
		l1.add("Last");
		System.out.println(l1);
		System.out.println(l1.hashCode());
		l1.addFirst("Before first");
		l1.addLast("After Last");
		System.out.println(l1);
		System.out.println(l1.contains(123));
		System.out.println("Itreating through Iterator it1");

		Iterator it1 = l1.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());

		}

		LinkedList l2 = new LinkedList();
		l2.addAll(a1);
		System.out.println("Add Collection Operation with array list and linkedlist");
		System.out.println(l2);

		

	}

}
