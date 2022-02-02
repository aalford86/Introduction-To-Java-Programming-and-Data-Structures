package chapter_02;

import java.util.Scanner;

/**
 * Exercise 2.3
 *
 * (Convert Feet Into Meters) Write a program that reads a number in feet,
 * converts it to meters, and displays the result. One foot is 0.305 meter.
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public final class Exercise_2_03 {

	/**
	 * Private constructor so this utility class cannot be instantiated.
	 */
	private Exercise_2_03() {

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
		System.out.println("Exercise 2.3: Convert Feet Into Meters");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt user to enter feet to convert into meters.
		 */
		System.out.print("\nEnter the value for feet: ");
		double feet = consoleInput.nextDouble();

		/*
		 * Convert feet into meters.
		 */
		double meter = feet * 0.305;

		/*
		 * Output results to console.
		 */
		System.out.println(feet + " feet is " + meter + " meters.");

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
