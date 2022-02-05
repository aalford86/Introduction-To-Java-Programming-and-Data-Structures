package chapter_03;

import java.util.Scanner;

/**
 * Exercise **3.27
 *
 * (Geometry: Points In Triangle?) Suppose a right triangle is placed in a plane
 * as shown below. The right-angle point is placed at (0,0), and the other two
 * points are placed at (200, 0) and (0, 100). Write a program that prompts the
 * user to enter a point with x- and y-coordinates and determines whether the
 * point is inside the triangle.
 *
 * <pre>
 *
 * Here are the sample runs:
 *
 * Enter a point's x- and y-coordinates: 100.5 25.5
 * The point is in the triangle
 *
 * Enter a point's x- and y-coordinates: 100.5 50.5
 * The point is not in the triangle
 *
 * </pre>
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public class Exercise_3_27 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("Exercise **3.27 - Geometry: Points In Triangle?");
		System.out.println("");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt the user to enter the x- and y-coordinate for the point to test if is
		 * inside the triangle.
		 */
		System.out.print("Enter a point's x- and y-coordinates: ");
		double x = consoleInput.nextDouble();
		double y = consoleInput.nextDouble();

		/*
		 * Set points for triangle.
		 */
		final double MIN_WIDTH = 0.0;
		final double MIN_HEIGHT = 0.0;
		final double MAX_WIDTH = 200.0;
		final double MAX_HEIGHT = 100.0;

		/*
		 * If point is inside triangle set message to in, otherwise set message to out.
		 */
		String pointPosition = "not it";

		if ((x >= MIN_WIDTH) && (x <= MAX_WIDTH - y / 2) && (y >= MIN_HEIGHT) && (y <= MAX_HEIGHT - x / 2)) {

			pointPosition = "in";

		}

		/*
		 * Display result to console.
		 */
		System.out.print("The point is " + pointPosition + " the triangle.");

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
