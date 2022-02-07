package chapter_04;

import java.util.Scanner;

/**
 * Exercise *4.5
 *
 * (Geometry: area of a regular polygon) A regular polygon is an n-sided polygon
 * in which all sides are of the same length and all angles have the same degree
 * (i.e., the polygon is both equilateral and equiangular).
 *
 * <pre>
 *
 * The formula for computing the area of a regular polygon is:
 *
 *            n x s^2
 * Area = ---------------
 *        4 x tan(pi / n)
 *
 * Where,
 *
 * s is the length of a side.
 * n is the number of sides.
 *
 * </pre>
 *
 * Write a program that prompts the user to enter the number of sides and their
 * length of a polygon and displays its area.
 *
 * <pre>
 *
 * Here is a sample run:
 *
 * Enter the number of sides: 5
 * Enter the side: 6.5
 * The area of the polygon is 72.69017017488385
 *
 * </pre>
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public class Exercise_4_05 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("\nExercise *4.5 Geometry: Area Of A Regular Polygon\n");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt the user to enter the number of sides of the polygon.
		 */
		System.out.print("Enter the number of sides: ");
		int numberOfSides = consoleInput.nextInt();

		/*
		 * Prompt the user to enter the length of a side.
		 */
		System.out.print("Enter the side: ");
		double length = consoleInput.nextDouble();

		/*
		 * Compute area of the polygon.
		 */
		double area = numberOfSides * Math.pow(length, 2) / (4 * Math.tan(Math.PI / numberOfSides));

		/*
		 * Display result to console.
		 */
		System.out.printf("The area of the polygon is %,f", area);

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
