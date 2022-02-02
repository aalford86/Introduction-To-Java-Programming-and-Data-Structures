package chapter_02;

import java.util.Scanner;

/**
 * Exercise *2.19
 *
 * (Geometry: Area Of A Triangle) Write a program that prompts the user to enter
 * three points, (x1, y1), (x2, y2), and (x3, y3), of a triangle then displays
 * its area.
 *
 * <pre>
 *
 * The formula for computing the area of a triangle is
 *
 * s = (side1 + side2 + side3) / 2
 *
 * area = sqrt(s (s - side1)(s - side2)(s - side3))
 *
 * </pre>
 *
 * @Book Introduction to JAVA, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public final class Exercise_2_19 {

	/**
	 * Private constructor so this utility class cannot be instantiated.
	 */
	private Exercise_2_19() {

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
		System.out.println("Exercise *2.19 - Geometry: Area Of A Triangle");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt the user to enter the coordinates for points 1, 2, and 3.
		 */
		System.out.print("\nEnter the x and y coordinates for point 1: ");
		double x1 = consoleInput.nextDouble();
		double y1 = consoleInput.nextDouble();

		System.out.print("Enter the x and y coordinates for point 2: ");
		double x2 = consoleInput.nextDouble();
		double y2 = consoleInput.nextDouble();

		System.out.print("Enter the x and y coordinates for point 3: ");
		double x3 = consoleInput.nextDouble();
		double y3 = consoleInput.nextDouble();

		/*
		 * Compute sides.
		 */
		double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
		double side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
		double side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);
		double s = (side1 + side2 + side3) / 2;

		/*
		 * Compute the area of a triangle.
		 */
		double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);

		/*
		 * Output result to console.
		 */
		System.out.println("\nThe area of the triangle is " + area);

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
