package com.jtc.hstset;

import java.util.*;

public class Test {

	public static void main(String[] args) {

		HashSet hs = new HashSet();
		hs.add("aa");
		hs.add(123);
		hs.add(456);
		hs.add("dd");
		hs.add(null);
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs);
		System.out.println(hs.add("aa"));
		System.out.println("While adding duplicte elements ="+hs);

	}

}
