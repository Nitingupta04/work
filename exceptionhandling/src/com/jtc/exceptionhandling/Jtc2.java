//Jtc-2 | Example using try and multiple catch blocks.
package com.jtc.exceptionhandling;

public class Jtc2 {

	public static void main(String[] args) {
		System.out.println("main begain");
		try {
			System.out.println("try statement 1");
			int x = Integer.parseInt(args[0]);
			System.out.println(x);
			int y = 10 / x;
			System.out.println(y);
		}

		// System.out.println("not OK");

		catch (NumberFormatException e) {
			System.out.println("Please provide integer number");
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}

		finally {

			System.out.println("This is from finally block");

		}

		System.out.println("main end");

	}

}
