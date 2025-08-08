package com.jtcindia.logicalquestions;

public class Jtc1 {

	public static void main(String[] args) {

		System.out.println("-- Here our program started runing --");

		int arr1[] = new int[100];

		for (int i = 1; i <= arr1.length; i++) {

			if (i == 13) {
				System.out.println("index=" + i);
				continue;				
			} else

				arr1[i - 1] = i;			
		}

		for (int i = 1; i <= arr1.length; i++) {
			System.out.print(" | " + i + " | ");
		}

	}

}
