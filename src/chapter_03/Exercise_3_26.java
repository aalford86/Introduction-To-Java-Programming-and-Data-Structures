package chapter_03;

import java.util.Scanner;

/**
 * Exercise 3.26
 *
 * (Use The &&, ||, and ^ operators) Write a program that prompts the user to
 * enter an integer and determines whether it is divisible by 5 and 6, whether
 * it is divisible by 5 or 6, and whether it is divisible by 5 or 6, but not
 * both.
 *
 * <pre>
 *
 * Here is a sample run of this program:
 *
 * Enter an integer: 10
 * Is 10 divisible by 5 and 6? false
 * Is 10 divisible by 5 or 6? true
 * Is 10 divisible by 5 or 6, but not both? true
 *
 * </pre>
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public class Exercise_3_26 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("Exercise 3.26 - Use The &&, ||, And ^ Operators");
		System.out.println("");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt user to enter the numerator.
		 */
		System.out.print("Enter an integer: ");
		int number = consoleInput.nextInt();
		System.out.println("");

		/*
		 * Set constants for divisors.
		 */
		final double DIVISOR_5 = 5;
		final double DIVISOR_6 = 6;

		/*
		 * Display result to console.
		 */
		System.out.print("Is " + number + " divisible by " + DIVISOR_5 + " and " + DIVISOR_6 + ": ");
		System.out.println(number % DIVISOR_5 == 0 && number % DIVISOR_6 == 0);

		System.out.print("Is " + number + " divisible by " + DIVISOR_5 + " or " + DIVISOR_6 + ": ");
		System.out.println(number % DIVISOR_5 == 0 || number % DIVISOR_6 == 0);

		System.out.print("Is " + number + " divisible by " + DIVISOR_5 + " or " + DIVISOR_6 + ", but not both: ");
		System.out.println(number % DIVISOR_5 == 0 ^ number % DIVISOR_6 == 0);

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
