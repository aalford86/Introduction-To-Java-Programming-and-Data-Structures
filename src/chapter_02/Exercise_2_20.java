package chapter_02;

import java.util.Scanner;

/**
 * Exercise *2.20
 *
 * (Financial application: calculate interest) If you know the balance and the
 * annual percentage interest rate, you can compute the interest on the next
 * monthly payment using the following formula:
 *
 * <pre>
 *
 * Formula:
 *
 * interest = balance x (annualInterestRate / 1200)
 *
 * </pre>
 *
 * Write a program that reads the balance and the annual percentage interest
 * rate and displays the interest for the next month.
 *
 * @Book Introduction to JAVA, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public final class Exercise_2_20 {

	/**
	 * Private constructor so this utility class cannot be instantiated.
	 */
	private Exercise_2_20() {

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
		System.out.println("Exercise*2.20 - Financial Application: Calculate Interest");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt user to enter the account balance and interest rate.
		 */
		System.out.print("\nEnter balance and interest rate (e.g., 3 for 3%): ");
		double balance = consoleInput.nextDouble();
		double interestRate = consoleInput.nextDouble();

		/*
		 * Compute the interest.
		 */
		double interest = balance * (interestRate / 1200);

		/*
		 * Output results to console.
		 */
		System.out.println("\nThe interest is " + interest);

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
