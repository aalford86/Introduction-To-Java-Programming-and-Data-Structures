package chapter_03;

import java.util.Scanner;

/**
 * Exercise *3.34
 *
 * (Geometry: Point On Line Segment) Exercise 3.32 shows how to test whether a
 * point is on an unbounded line. Revise Exercise 3.32 to test whether a point
 * is on a line segment. Write a program that prompts the user to enter the
 * three points for p0, p1, and p2 and displays whether p2 is on the line
 * segment from p0 to p1.
 *
 * <pre>
 *
 * Here are some sample runs:
 *
 * Enter three points for p0, p1, and p2: 1 1 2.5 2.5 1.5 1.5
 * (1.5, 1.5) is on the line segment from (1.0, 1.0) to (2.5, 2.5)
 *
 * Enter three point for p0, p1, and p2: 1 1 2 2 3.5 3.5
 * (3.5, 3.5) is not on the line segment from (1.0, 1.0) to (2.0, 2.0)
 *
 * </pre>
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public class Exercise_3_34 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("Exercise *3.34 - Geometry: Point On Line Segment");
		System.out.println("");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt user to enter the x-, y-coordinates for p0, p1, and p2.
		 */
		System.out.print("Enter three points for p0, p1, and p2: ");
		double x0 = consoleInput.nextDouble();
		double y0 = consoleInput.nextDouble();
		double x1 = consoleInput.nextDouble();
		double y1 = consoleInput.nextDouble();
		double x2 = consoleInput.nextDouble();
		double y2 = consoleInput.nextDouble();

		/*
		 * Point coordinates.
		 */
		String point0 = "(" + x0 + ", " + y0 + ")";
		String point1 = "(" + x1 + ", " + y1 + ")";
		String point2 = "(" + x2 + ", " + y2 + ")";

		/*
		 * Determine where the point is located and set appropriate message.
		 */
		String position = "not on";

		/*
		 * Compute position of the point.
		 */
		double pointPosition = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

		/*
		 * Checks if point is with the line segments range and domain.
		 */
		boolean boundary = ((x2 > x1) && (x2 < x0) || (x2 > x0) && (x2 < x1));

		/*
		 * Display result to console.
		 */
		if (pointPosition == 0 && boundary) {
			position = "on";
		}

		System.out.print(point2 + " is " + position + " the line segment from " + point0 + " to " + point1);

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
