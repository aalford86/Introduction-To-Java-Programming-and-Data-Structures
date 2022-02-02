package chapter_02;

import java.util.Scanner;

/**
 * Exercise **2.6
 *
 * (Sum The Digits In An Integer) Write a program that reads an integer between
 * 0 and 1000 and adds all the digits in the integer, For example, if an integer
 * is 932, the sum of all its digits is 14.
 *
 * Hint: Use the % operator to extract digits, and use the / operator to remove
 * the extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public final class Exercise_2_06 {

	/**
	 * Private constructor so this utility class cannot be instantiated.
	 */
	private Exercise_2_06() {

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
		System.out.println("Exercise **2.6 - Sum The Digits In An Integer");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt the user for an integer between 0 and 1000.
		 */
		System.out.print("\nEnter a number between 0 and 1000: ");
		int digits = consoleInput.nextInt();

		/*
		 * Compute the sum of the digits.
		 */
		int sumOfDigits = 0;

		sumOfDigits += digits % 10;
		digits /= 10;

		sumOfDigits += digits % 10;
		digits /= 10;

		sumOfDigits += digits % 10;
		digits /= 10;

		sumOfDigits += digits;

		/*
		 * Output results to console.
		 */
		System.out.println("\nThe sum of the digits is " + sumOfDigits);

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
