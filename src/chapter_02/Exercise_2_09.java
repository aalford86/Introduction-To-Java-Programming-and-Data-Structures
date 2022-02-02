package chapter_02;

import java.util.Scanner;

/**
 * Exercise 2.9
 *
 * (Physics: acceleration) Average acceleration is defined as the change of
 * velocity divided by the time taken to make the change, as given by the
 * following formula:
 *
 * <pre>
 * Formula:
 *
 *      v1 - v0
 * a = ----------
 *         t
 * </pre>
 *
 * Write a program that prompts the user to enter the starting velocity vo in
 * meter/second, the ending velocity v1 in meters/second, and the time span t in
 * seconds, then displays the average acceleration.
 *
 * @Book Introduction to JAVA, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public final class Exercise_2_09 {

	/**
	 * Private constructor so this utility class cannot be instantiated.
	 */
	private Exercise_2_09() {

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
		System.out.println("Exercise 2.9 - Physics: Acceleration");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt the user to enter the initial velocity, final velocity, and time in
		 * seconds.
		 */
		System.out.print("\nEnter v0, v1, and t: ");
		double v0 = consoleInput.nextDouble();
		double v1 = consoleInput.nextDouble();
		double t = consoleInput.nextDouble();

		/*
		 * Compute the acceleration.
		 */
		double acceleration = (v1 - v0) / t;

		/*
		 * Output result to console.
		 */
		System.out.println("The average acceleration is " + acceleration);

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
