package chapter_02;

import java.util.Scanner;

/**
 * Exercise *2.5
 *
 * (Financial application: calculate tips) Write a program that reads the
 * subtotal and the gratuity rate, then computes the gratuity and total. For
 * example, if the user enters 10 for subtotal and 15% for gratuity rate the
 * program displays $1.5 as gratuity and $11.5 as total.
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public final class Exercise_2_05 {

	/**
	 * Private constructor so this utility class cannot be instantiated.
	 */
	private Exercise_2_05() {

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
		System.out.println("Exercise *2.5 - Financial Application: Calculate Tips");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt user to enter subtotal.
		 */
		System.out.print("\nEnter the subtotal: ");
		double subtotal = consoleInput.nextDouble();

		/*
		 * Prompt user to enter gratuity.
		 */
		System.out.print("Enter the gratuity: ");
		double gratuityRate = consoleInput.nextDouble();

		/*
		 * Compute gratuity.
		 */
		double gratuity = subtotal * (gratuityRate / 100);

		/*
		 * Compute total.
		 */
		double total = subtotal + gratuity;

		/*
		 * Output result to console.
		 */
		System.out.println("\nThe gratuity is " + gratuity + " and total is " + total);

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
