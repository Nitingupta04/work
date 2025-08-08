package com.jtcindia.logicalquestions;

class Hello {
	int a = 10;

	static {
		System.out.println("-- Static Block Inside class Hello --");

		{
			System.out.println("-- Instance block inside ststic block --");
		}

	}
}

public class Staticblockeg {

	public static void main(String[] args) {

		Hello h1 = new Hello();
		System.out.println("-- Value of a = " + h1.a);

	}

}
