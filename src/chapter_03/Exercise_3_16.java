package chapter_03;

import java.util.Scanner;

/**
 * Exercise 3.16
 *
 * (Random Point) Write a program that displays a random coordinate in a
 * rectangle. The rectangle is centered at (0, 0) with width 100 and height 200.
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public final class Exercise_3_16 {

	/**
	 * Private constructor so this utility class cannot be instantiated.
	 */
	private Exercise_3_16() {

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
		System.out.println("Exercise 3.16 - Random Point");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Declare the constants for the maximum and minimum values that the x and y
		 * coordinates can be.
		 */
		final double X_COORD_MAX = 50.0;
		final double X_COORD_MIN = -50.0;
		final double Y_COORD_MAX = 100.0;
		final double Y_COORD_MIN = -100.0;

		/*
		 * Generate a random x coordinate with in a set range of possible coordinates.
		 */
		double xCoordinate = Math.random() * ((X_COORD_MAX - X_COORD_MIN) + 1) + X_COORD_MIN;

		/*
		 * Generate a random y coordinate with in a set range of possible coordinates.
		 */
		double yCoordinate = Math.random() * ((Y_COORD_MAX - Y_COORD_MIN) + 1) + Y_COORD_MIN;

		/*
		 * Output result to console.
		 */
		System.out.println("");
		System.out.println("The random x coordinate: " + xCoordinate);
		System.out.println("The random y coordinate: " + yCoordinate);

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
