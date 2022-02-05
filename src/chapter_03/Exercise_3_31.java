package chapter_03;

import java.util.Scanner;

/**
 * Exercise *3.31
 *
 * (Financials: Currency Exchange) Write a program that prompts the user to
 * enter the exchange rate from currency in U.S. dollars to Chinese RMB. Prompt
 * the user to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to
 * convert from Chinese RMB to U.S. dollars. Prompt the user to enter the amount
 * in U.S. dollars or Chinese RMB to convert it to Chinese RMB or U.S. dollars,
 * respectively.
 *
 * <pre>
 *
 * Here are the sample runs:
 *
 * Enter the exchange rate from dollars to RMB: 6.81
 * Enter 0 to convert dollars to RMB and 1 vice versa: 0
 * Enter the dollar amount: 100
 * $100.0 is 681.0 yuan
 *
 * Enter the exchange rate from dollars to RMB: 6.81
 * Enter 0 to convert dollars to RMB and 1 vice versa: 1
 * Enter the RMB amount: 10000
 * 10000.0 yuan is $1468.43
 *
 * Enter the exchange rate from dollars to RMB: 6.81
 * Enter 0 to convert dollars to RMB and 1 vice versa: 5
 * Incorrect input
 *
 * </pre>
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public class Exercise_3_31 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("Exercise *3.31 - Financials: Currency Exchange");
		System.out.println("");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt user to enter the exchange rate from dollars to RMB.
		 */
		System.out.print("Enter the exchange rate from dollars to RMB: ");
		double exchangeRate = consoleInput.nextDouble();

		/*
		 * Prompt user to enter the conversion option. 0 to convert dollars to RMB 1 to
		 * RMB to dollars
		 */
		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		int conversion = consoleInput.nextInt();

		/*
		 * Check user conversion for valid input. Compute conversion if input is valid
		 * otherwise display incorrect input.
		 */
		switch (conversion) {

		case 0:

			/*
			 * Prompt user to enter the dollar amount to convert to RMD.
			 */
			System.out.print("Enter the dollar amount: ");
			double dollars = consoleInput.nextDouble();
			System.out.println("$" + dollars + " is " + dollars * exchangeRate + " yuan");

			break;

		case 1:

			/*
			 * Prompt user to enter the RMD amount to convert to dollars
			 */
			System.out.print("Enter the yuan amount: ");
			double yuan = consoleInput.nextDouble();
			System.out.println(yuan + " yuan is $" + (int) (yuan / exchangeRate * 100) / 100.0);

			break;

		default:

			/*
			 * If user input is invalid display message.
			 */
			System.out.print("Incorrect Input");
		}

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
