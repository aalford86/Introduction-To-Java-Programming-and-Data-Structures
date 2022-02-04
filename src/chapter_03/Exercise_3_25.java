package chapter_03;

import java.util.Scanner;

/**
 * Exercise *3.25
 *
 * (Geometry: Intersecting Point) Two points on line 1 and given as (x1, y1) and
 * (x2, y2) and on line 2 as (x3, y3) and (x4, y4), as shown in Figure 3.8a and
 * b. The intersecting point of the two lines can be found by solving the
 * following linear equation:
 *
 * <pre>
 *
 * (y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1
 * (y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3
 *
 * </pre>
 *
 * This linear equation can be solved using Cramer's rule (see Programming
 * Exercise 3.3). If the equation has no solutions, the two lines are parallel
 * (see Figure 3.8c).
 *
 * Write a program that prompts the user to enter four points and displays the
 * intersecting point. Here are sample runs:
 *
 * <pre>
 *
 * Enter x1, y1, x2, y2, x3, y3, x4, y4: 2 2 5 -1.0 4.0 2.0 -1.0 -2.0
 * The intersecting point is at (2.88889, 1.1111)
 *
 * Enter x1, y1, x2, y2, x3, y3, x4, y4: 2 2 7 6.0 4.0 2.0 -1.0 -2.0
 * The two lines are parallel
 *
 * </pre>
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public class Exercise_3_25 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("Exercise *3.25 - Geometry: Intersecting Point");
		System.out.println("");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt the user to enter the coordinates for the four points.
		 */
		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		double x1 = consoleInput.nextDouble();
		double y1 = consoleInput.nextDouble();
		double x2 = consoleInput.nextDouble();
		double y2 = consoleInput.nextDouble();
		double x3 = consoleInput.nextDouble();
		double y3 = consoleInput.nextDouble();
		double x4 = consoleInput.nextDouble();
		double y4 = consoleInput.nextDouble();

		/*
		 * Set up variables for Cramer's rule.
		 */
		double a = y1 - y2;
		double b = x1 - x2;
		double c = y3 - y4;
		double d = x3 - x4;
		double e = (y1 - y2) * x1 - (x1 - x2) * y1;
		double f = (y3 - y4) * x3 - (x3 - x4) * y3;

		/*
		 * Compute the denominator for Cramer's rule using ad - bc.
		 */
		double denominator = a * d - b * c;

		/*
		 * If denominator is 0 the lines are parallel, if not use Cramer's rule to
		 * calculate the x and y values for the intersecting point.
		 */
		if (denominator == 0) {

			System.out.println("The two lines are parallel.");

		} else {
			double x = (e * d - b * f) / denominator;
			double y = (a * f - e * c) / denominator;

			System.out.println("The intersecting point is at (" + x + ", " + y + ")");
		}

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
