package chapter_02;

import java.util.Scanner;

/**
 * Exercise 2.12
 *
 * (Physics: finding runway length) Given an airplane's acceleration a and
 * take-off speed v, you can compute the minimum runway length needed for an
 * airplane to take off using the following formula:
 *
 * <pre>
 *
 * Formula:
 *
 *           v^2
 * length = -----
 *            2a
 *
 * </pre>
 *
 * Write a program that prompts the user to enter v in meters/second (m/s) and
 * the acceleration a in meters/second squared (m/s^2), then, displays the
 * minimum runway length.
 *
 * @Book Introduction to JAVA, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public final class Exercise_2_12 {

	/**
	 * Private constructor so this utility class cannot be instantiated.
	 */
	private Exercise_2_12() {

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
		System.out.println("Exercise 2.12 - Physics: Finding Runway Length");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt the user to enter the speed and acceleration of the airplane.
		 */
		System.out.print("\nEnter speed and acceleration: ");
		double v = consoleInput.nextDouble(); // Speed(v)
		double a = consoleInput.nextDouble(); // Acceleration(a)

		/*
		 * Compute runway length.
		 */
		double length = Math.pow(v, 2) / (2 * a); // Minimum runway length needed.

		/*
		 * Output result to console.
		 */
		System.out.println("The minimum runway length for this airplane is " + length);

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
