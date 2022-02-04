package chapter_03;

import java.util.Scanner;

/**
 * Exercise **3.22
 *
 * (Geometry: Point In A Circle?) Write a program that prompts the user to enter
 * a point (x, y) and checks whether the point is within the circle centered at
 * (0, 0) with radius 10. For example, (4, 5) is inside the circle and (9, 9) is
 * outside the circle, as shown in Figure 3.7a.
 *
 * (Hint: A point is in the circle if its distance to (0, 0) is less than or
 * equal to 10.
 *
 * <pre>
 *
 * The formula for computing the distance:
 *
 * sqrt((x2 - x1)^2 + (y2 - y1)^2)
 *
 * </pre>
 *
 * Test your program to cover all cases.
 *
 * <pre>
 *
 * Two sample runs  are shown below:
 *
 * Enter a point with two coordinates: 4 5
 * Point (4.0, 5.0) is in the circle
 *
 * Enter a point with two coordinates: 9 9
 * Point (9.0, 9.0) is not in the circle
 *
 * </pre>
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public class Exercise_3_22 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("Exercise **3.22 - Geometry: Point In A Circle?");
		System.out.println("");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt user to enter two coordinates x and y.
		 */
		System.out.print("Enter a point with two coordinates: ");
		double xCoord = consoleInput.nextDouble();
		double yCoord = consoleInput.nextDouble();

		/*
		 * Declare and set center coordinates for circle.
		 */
		final double X_COORD_CENTER = 0.0;
		final double Y_COORD_CENTER = 0.0;
		final double CIRCLE_RADIUS = 10.0;

		/*
		 * Compute distance from circle center to user defined point.
		 */
		double distance = Math.sqrt(Math.pow(xCoord - X_COORD_CENTER, 2) + Math.pow(yCoord - Y_COORD_CENTER, 2));

		/*
		 * Set message if point is or is not in circle.
		 */
		String inCircle = (distance <= CIRCLE_RADIUS ? " is " : " is not ");

		/*
		 * Display result to console.
		 */
		System.out.print("Point (" + xCoord + ", " + yCoord + ")" + inCircle + "in the circle.");

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
