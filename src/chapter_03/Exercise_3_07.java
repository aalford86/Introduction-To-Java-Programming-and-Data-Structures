package chapter_03;

import java.util.Scanner;

/**
 * Exercise 3.7
 *
 * (Financial application: monetary units) Modify 2.10, ComputeChange.java, to
 * display the nonzero denominations only, using singular words for single units
 * such as 1 dollar and 1 penny, and plural words for more than one unit such as
 * 2 dollars and 3 pennies.
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public final class Exercise_3_07 {

	/**
	 * Private constructor so this utility class cannot be instantiated.
	 */
	private Exercise_3_07() {

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
		System.out.println("Exercise 3.7 - Financial Application: Monetary Units");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt user to enter amount.
		 */
		System.out.print("\nEnter an amount in double, for example, 11.56: ");
		double amount = consoleInput.nextDouble();

		int remainingAmount = (int) (amount * 100);

		/*
		 * Find the number of one dollars.
		 */
		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount %= 100;

		/*
		 * Find the number of quarters in the remaining amount.
		 */
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount %= 25;

		/*
		 * Find the number of dimes in the remaining amount.
		 */
		int numberOfDimes = remainingAmount / 10;
		remainingAmount %= 10;

		/*
		 * Find the number of nickels in the remaining amount.
		 */
		int numberOfNickels = remainingAmount / 5;
		remainingAmount %= 5;

		/*
		 * Find the number of pennies in the remaining amount.
		 */
		int numberOfPennies = remainingAmount;

		/*
		 * Close input stream.
		 */
		consoleInput.close();

		/*
		 * Display results to console.
		 */
		System.out.println("\nYour amount " + amount + " consists of");

		if (numberOfOneDollars > 0) {

			System.out.print(numberOfOneDollars);

			if (numberOfOneDollars > 1) {
				System.out.println(" dollars");
			} else {
				System.out.println(" dollar");
			}
		}

		if (numberOfQuarters > 0) {

			System.out.print(numberOfQuarters);

			if (numberOfQuarters > 1) {
				System.out.println(" quarters");
			} else {
				System.out.println(" quarter");
			}
		}

		if (numberOfDimes > 0) {

			System.out.print(numberOfDimes);

			if (numberOfDimes > 1) {
				System.out.println(" dimes");
			} else {
				System.out.println(" dime");
			}
		}

		if (numberOfNickels > 0) {

			System.out.print(numberOfNickels);

			if (numberOfNickels > 1) {
				System.out.println(" nickels");
			} else {
				System.out.println(" nickel");
			}
		}

		if (numberOfPennies > 0) {

			System.out.print(numberOfPennies);

			if (numberOfPennies > 1) {
				System.out.println(" pennies");
			} else {
				System.out.println(" penny");
			}
		}

	}

}
