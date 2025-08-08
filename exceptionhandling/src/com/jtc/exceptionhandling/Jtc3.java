//Jtc 3 | Example using multiple try and catch blocks.
package com.jtc.exceptionhandling;

public class Jtc3 {

	public static void main(String[] args) {
		System.out.println("Main Begain");
		String s = null;
		try {

			s = args[0];

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Please provide any value");
			System.out.println(e);
		}

		int x = 0;

		try {
			x = Integer.parseInt(s);
			System.out.println("Argument Value = "+x);

		} catch (NumberFormatException e) {
			System.out.println("Please enter any numeric value 1-9");
			System.out.println(e);

		}

		try {
			int y = 10 / x;
			System.out.println(y);

		} catch (ArithmeticException e) {
			System.out.println("Please dont provide zero");
			System.out.println(e);

		}

		System.out.println("Main end");
	}

}
