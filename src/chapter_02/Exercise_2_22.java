package chapter_02;

import java.util.Scanner;

/**
 * Exercise *2.22
 *
 * (Financial application: monetary units) Rewrite Listing 2.10,
 * ComputeChange.java, to fix the possible loss of accuracy when converting a
 * double value to an int value. Enter the input as an integer whose last two
 * digits represent the cents. For example, the input 1156 represents 11 dollars
 * and 56 cents.
 *
 * @Book Introduction to JAVA, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public final class Exercise_2_22 {

	/**
	 * Private constructor so this utility class cannot be instantiated.
	 */
	private Exercise_2_22() {

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
		System.out.println("Exercise *2.22 - Financial Application: Monetary Units");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt user to enter an amount with the last two digits representing cents.
		 */
		System.out.print("\nEnter an amount as an integer, for example 1156 = $11.56: ");
		int amount = consoleInput.nextInt();

		int remainingAmount = amount;

		/*
		 * Find the number of one dollars.
		 */
		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;

		/*
		 * Find the number of quarters in the remaining amount.
		 */
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;

		/*
		 * Find the number of dimes in the remaining amount.
		 */
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;

		/*
		 * Find the number of nickels in the remaining amount.
		 */
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;

		/*
		 * Find the number of pennies in the remaining amount.
		 */
		int numberOfPennies = remainingAmount;

		/*
		 * Display results to console.
		 */
		System.out.println("\nYour amount " + amount + " consists of:");
		System.out.println("\t" + numberOfOneDollars + " dollars");
		System.out.println("\t" + numberOfQuarters + " quarters");
		System.out.println("\t" + numberOfDimes + " dimes");
		System.out.println("\t" + numberOfNickels + " nickels");
		System.out.println("\t" + numberOfPennies + " pennies");

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
