package chapter_02;

import java.util.Scanner;

/**
 * Exercise 2.15
 *
 * (Geometry: Distance Of Two Points) Write a program that prompts the user to
 * enter two points (x1, y1) and (x2, y2) and displays their distance. The
 * formula for computing the distance is sqrt((x2 - x1)^2 + (y2 - y1)^2). Note
 * you can use Math.pow(a, 0.5) to compute sqrt(a).
 *
 * @Book Introduction to JAVA, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public final class Exercise_2_15 {

	/**
	 * Private constructor so this utility class cannot be instantiated.
	 */
	private Exercise_2_15() {

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
		System.out.println("Exercise 2.15 - Distance Of Two Points");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt the user for the x and y coordinates for point 1.
		 */
		System.out.print("\nEnter x1 and y1: ");
		double x1 = consoleInput.nextDouble();
		double y1 = consoleInput.nextDouble();

		/*
		 * Prompt the user for the x and y coordinates for point 2.
		 */
		System.out.print("Enter x2 and y2: ");
		double x2 = consoleInput.nextDouble();
		double y2 = consoleInput.nextDouble();

		/*
		 * Compute the distance between points 1 and 2.
		 */
		double distance = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);

		/*
		 * Output result to console.
		 */
		System.out.println("The distance between the two points is " + distance);

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
