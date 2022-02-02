package chapter_03;

import java.util.Scanner;

/**
 * Exercise 3.12
 *
 * (Palindrome Integer) Write a program that prompts the user to enter a
 * three-digit integer and determines whether it is a palindrome integer. An
 * integer is palindrome if it reads the same from right to left and from left
 * to right. A negative integer is treated the same as a positive integer.
 *
 * @Book Introduction to JAVA, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public final class Exercise_3_12 {

	/**
	 * Private constructor so this utility class cannot be instantiated.
	 */
	private Exercise_3_12() {

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
		System.out.println("Exercise 3.12 - Palindrome Integer");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt user to enter a three digit integer.
		 */
		System.out.print("\nEnter a three-digit integer: ");
		int number = consoleInput.nextInt();

		/*
		 * Get the last digit from the three-digit number.
		 */
		int thirdDigit = number % 10;

		/*
		 * Get the first digit from the three-digit number.
		 */
		int firstDigit = number / 100;

		/*
		 * Compare fist and third digits to determine if number is a palindrome. Display
		 * results to console.
		 */
		System.out.print(number + " is " + ((firstDigit == thirdDigit) ? "a palindrome." : "not a palindrome."));

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
