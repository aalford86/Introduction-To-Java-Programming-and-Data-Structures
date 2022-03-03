package chapter_05;

import java.util.Scanner;

/**
 * Exercise 5.3 (Conversion from kilograms to pounds) Write a program that
 * displays the following table (note 1 kilogram is 2.2 pounds):
 *
 * <pre>
 *
 * Kilograms Pounds
 * 1            2.2
 * 3            6.6
 * . . .
 * 197        433.4
 * 199        437.8
 *
 * </pre>
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date March 2022
 * @author Alex Alford
 *
 */
public class Exercise_5_03 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("\nExercise 5.3 - Conversion From Kilograms To Pounds\n");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Display table header.
		 */
		System.out.printf("%10s %10s %n", "Kilograms", "Pounds");

		/*
		 * Output to console each row for conversion of kilograms to pounds.
		 */
		for (int i = 1; i < 200; i += 2) {

			final double KILOGRAMS_TO_POUND = 2.2;
			double pounds = i * KILOGRAMS_TO_POUND;

			System.out.printf("%10d %10.1f %n", i, pounds);

		}

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
