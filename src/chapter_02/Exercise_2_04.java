package chapter_02;

import java.util.Scanner;

/**
 * Exercise 2.4
 *
 * (Convert pounds into kilograms) Write a program that converts pounds into
 * kilograms. The program prompts the user to enter a number in pounds, converts
 * it to kilograms, and displays the result. One pound is 0.454 kilogram.
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public final class Exercise_2_04 {

	/**
	 * Private constructor so this utility class cannot be instantiated.
	 */
	private Exercise_2_04() {

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
		System.out.println("Exercise 2.4 - Convert pounds into kilograms");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt user to enter pounds to convert into kilograms.
		 */
		System.out.print("\nEnter a number in pounds: ");
		double pounds = consoleInput.nextDouble();

		/*
		 * Convert pounds into kilograms.
		 */
		double kilograms = pounds * 0.454;

		/*
		 * Output result to console.
		 */
		System.out.println(pounds + " pounds is " + kilograms + " kilograms.");

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
