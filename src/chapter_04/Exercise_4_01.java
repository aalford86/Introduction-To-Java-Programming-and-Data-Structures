package chapter_04;

import java.util.Scanner;

/**
 * Exercise 4.1
 *
 * (Geometry: Area Of A Pentagon) Write a program that prompts the user to enter
 * the length from the center of a pentagon to a vertex and computes the area of
 * the pentagon, as shown in the following figure.
 *
 * <pre>
 *
 * The formula for computing the area of a pentagon:
 *
 *             5 x s^2
 * Area = -----------------
 *         4 x tan(pi / 5)
 *
 * where,
 *
 * s is the length of a side. The side can be computed using the formula:
 * s = 2r sin(pi / 5)
 *
 * r is the length from the center of a pentagon to a vertex. Round up to two
 * digits after the decimal point.
 *
 * Here is a sample run:
 *
 * Enter the length from the center to a vertex: 5.5
 * The area of the pentagon is 71.92.
 *
 * </pre>
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public class Exercise_4_01 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("\nExercise 4.1 - Geometry: Area Of A Pentagon\n");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt the user to Enter the length from the center to a vertex.
		 */
		System.out.print("Enter the length from the center to a vertex: ");
		double r = consoleInput.nextDouble();

		/*
		 * Compute the length for a side of the pentagon.
		 */
		double s = 2 * r * Math.sin(Math.PI / 5);

		/*
		 * Compute the area of the pentagon.
		 */
		double area = (5 * Math.pow(s, 2) / (4 * Math.tan(Math.PI / 5)));

		/*
		 * Display result to console.
		 */
		System.out.printf("The area of the pentagon is %.2f", area);

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
