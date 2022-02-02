package chapter_02;

import java.util.Scanner;

/**
 * Exercise 2.16
 *
 * (Geometry: Area Of A Hexagon) Write a program that prompts the user to enter
 * the side of a hexagon and displays its area. The formula for computing the
 * area of a hexagon is
 *
 * <pre>
 *
 * Formula:
 *
 *         3 sqrt(3)
 * Area = ----------- s^2
 *             2
 *
 * </pre>
 *
 * where s is the length of a side.
 *
 * @Book Introduction to JAVA, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public final class Exercise_2_16 {

	/**
	 * Private constructor so this utility class cannot be instantiated.
	 */
	private Exercise_2_16() {

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
		System.out.println("Exercise 2.16 - Geometry: Area Of A Hexagon");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt the user to enter the length for a side of the hexagon.
		 */
		System.out.print("\nEnter the length of the side: ");
		double s = consoleInput.nextDouble(); // Side(s)

		/*
		 * Compute the area of the hexagon.
		 */
		double area = 3 * Math.pow(3, 0.5) / 2.0 * Math.pow(s, 2);

		/*
		 * Output results to console.
		 */
		System.out.println("The area of the hexagon is " + area);

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
