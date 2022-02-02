package chapter_03;

import java.util.Scanner;

/**
 * Exercise *3.8
 *
 * (Sort three integers) Write a program that prompts the user to enter three
 * integers and display the integers in non-decreasing order.
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public final class Exercise_3_08 {

	/**
	 * Private constructor so this utility class cannot be instantiated.
	 */
	private Exercise_3_08() {

	}

	/**
	 * Main method.
	 *
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("Exercise *3.8 - Sort Three Integers");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		System.out.print("\nEnter three integers to be sorted: ");
		int numOne = consoleInput.nextInt();
		int numTwo = consoleInput.nextInt();
		int numThree = consoleInput.nextInt();

		/*
		 * Sort integer values in non-decreasing order.
		 */
		int temp;

		if (numOne > numTwo) {
			temp = numOne;
			numOne = numTwo;
			numTwo = temp;
		}

		if (numOne > numThree) {
			temp = numOne;
			numOne = numThree;
			numThree = temp;
		}

		if (numTwo > numThree) {
			temp = numThree;
			numThree = numTwo;
			numTwo = temp;
		}

		/*
		 * Output result to console.
		 */
		System.out
				.println("\nThe integers in non-decreasing order are " + numOne + ", " + numTwo + ", and " + numThree);

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
