package chapter_04;

import java.util.Scanner;

/**
 * Exercise *4.26
 *
 * (Financial application: monetary units) Rewrite Listing 2.10,
 * ComputeChange.java, to fix the possible loss of accuracy when converting a
 * float value to an int value. Read the input as a string such as "11.56". Your
 * program should extract the dollar amount before the decimal point, and the
 * cents after the decimal amount using the indexOf and substring methods.
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public class Exercise_4_26 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("\nExercise *4.26 - Financial Application: Monetary Units\n");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt user to enter amount.
		 */
		System.out.print("\nEnter an amount in double, for example, 11.56: ");
		String amount = consoleInput.nextLine();

		/*
		 * Find the index position of decimal if exist.
		 */
		int decimalPosition = amount.indexOf('.');

		/*
		 * Declare and initialize dollars and cents.
		 */
		int dollars = 0;
		int cents = 0;
		int numberOfQuarters = 0;
		int numberOfDimes = 0;
		int numberOfNickels = 0;
		int numberOfPennies = 0;

		/*
		 * If decimal index is greater than -1 decimal exist set substring for dollars
		 * and cents.
		 */
		if (decimalPosition > -1) {

			/*
			 * Find the number of dollars and cents.
			 */
			dollars = Integer.parseInt(amount.substring(0, decimalPosition));
			cents = Integer.parseInt(amount.substring(decimalPosition + 1));

			/*
			 * Find the number of quarters in cents.
			 */
			numberOfQuarters = cents / 25;
			cents %= 25;

			/*
			 * Find the number of dimes in cents.
			 */
			numberOfDimes = cents / 10;
			cents %= 10;

			/*
			 * Find the number of nickels in cents.
			 */
			numberOfNickels = cents / 5;
			cents %= 5;

			/*
			 * Find the number of pennies in cents.
			 */
			numberOfPennies = cents;

		} else {

			/*
			 * Find the number of dollars with no cents entered.
			 */
			dollars = Integer.parseInt(amount);

		}

		/*
		 * Display results to console.
		 */
		System.out.printf("%nYour amount $%s consists of%n", amount);

		if (dollars > 0) {

			System.out.print(dollars);

			if (dollars > 1) {
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

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
