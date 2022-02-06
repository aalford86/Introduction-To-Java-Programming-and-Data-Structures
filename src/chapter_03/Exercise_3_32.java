package chapter_03;

import java.util.Scanner;

/**
 * Exercise *3.32
 *
 * (Geometry: Point Position) Given a directed line from point p0(x0, y0) to
 * p1(x1, y1), you can use the following condition to decide whether a point
 * p2(x2, y2) is on the left of the line, on the right, or on the same line (see
 * Figure 3.11):
 *
 * <pre>
 *
 *                                              { > 0 is on the left side of the line.
 * (x1 -x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) { = 0 is on the same line.
 *                                              { < 0 is on the right side of the line.
 *
 * </pre>
 *
 * Write a program that prompts the user to enter the three points for p0, p1,
 * and p2 and displays whether p2 is on the left of the line from p0 to p1, to
 * the right, or on the same line.
 *
 * <pre>
 *
 * Here are some sample runs;
 *
 * Enter three points for p0, p1, and p2: 4.4 2 6.5 9.5 -5 4
 * p2 is on the left side of the line
 *
 * Enter three points for p0, p1, and p2: 1 1 5 5 2 2
 * p2 is on the same line
 *
 * Enter three points for p0, p1, and p2: 3.4 2 6.5 9.5 5 2.5
 * p2 is on the right side of the line
 *
 * </pre>
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public class Exercise_3_32 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("Exercise *3.32 - Geometry: Point Position");
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
		 * Determine where the point is located and set appropriate message.
		 */
		String position = "same";

		/*
		 * Compute position of the point.
		 */
		double pointPosition = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

		if (pointPosition > 0) {

			position = "left side of the";

		} else if (pointPosition < 0) {

			position = "right side of the";

		}

		/*
		 * Display result to console.
		 */
		System.out.print("p2 is on the " + position + " line.");

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
