//Example using try catch and finally blocks
package com.jtc.exceptionhandling;

public class Jtc4 {

	public static void main(String[] args) {

	}

}

class ArithmeticOperation {
	public static int getRemainder(String val1, String val2) {
		int rem = -1;
		try {
			System.out.println("\n ** getRemainder **");
			System.out.println("Values \t:" + val1 + "\t" + val2);
			System.out.println("-- Converting into int type --");
			int ab = Integer.parseInt(val1);
			int bc = Integer.parseInt(val2);
			System.out.println("-- Accessing remainder --");
			rem = ab % bc;
			System.out.println("Remainder \t: " + rem);
			return rem;

		} catch (ArithmeticException e) {
			System.out.println("catch in getRemainder");
		}

		finally {
			System.out.println("++Finally Block in getRemainder ++");
		}

		return rem;
	}

}
