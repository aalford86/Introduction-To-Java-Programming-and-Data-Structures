package chapter_03;

import java.util.Scanner;

/**
 * Exercise **3.29
 *
 * (Geometry: Two Circles) Write a program that prompts the user to enter the
 * center coordinates and radii of two circles and determines whether the second
 * circle is inside the first or overlaps with the first, as shown in Figure
 * 3.10. (Hint: circle2 is inside circle1 if the distance between the two
 * centers <= r1 - r2 and circle2 overlaps circle1 if the distance between the
 * two centers <= r1 + r2. Test your program to cover all cases.)
 *
 * <pre>
 *
 * Here are the sample runs:
 *
 * Enter circle1's center x-, y-coordinates, and the radius: 0.5 5.1 13
 * Enter circle2's center x-, y-coordinates, and the radius: 1 1.7 4.5
 * circle2 is inside circle 1
 *
 * Enter circle1's center x-, y-coordinates, and the radius: 3.4 5.7 5.5
 * Enter circle2's center x-, y-coordinates, and the radius: 6.7 3.5 3
 * circle2 overlaps circle 1
 *
 * Enter circle1's center x-, y-coordinates, and the radius: 3.4 5.5 1
 * Enter circle2's center x-, y-coordinates, and the radius: 5.5 7.2 1
 * circle2 does not overlap circle 1
 *
 * </pre>
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public class Exercise_3_29 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("Exercise **3.29 - Geometry: Two Circles");
		System.out.println("");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt user to enter the x-, y-coordinates, and the radius for circles1's
		 * center.
		 */
		System.out.print("Enter circle1's center x-, y-coordinates, and the radius: ");
		double x1 = consoleInput.nextDouble();
		double y1 = consoleInput.nextDouble();
		double radius1 = consoleInput.nextDouble();

		/*
		 * Prompt user to enter the x-, y-coordinates, and the radius for circles2's
		 * center.
		 */
		System.out.print("Enter circle2's center x-, y-coordinates, and the radius: ");
		double x2 = consoleInput.nextDouble();
		double y2 = consoleInput.nextDouble();
		double radius2 = consoleInput.nextDouble();

		/*
		 * Compute distance between the circle centers.
		 */
		double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

		/*
		 * Set output message for circle positions.
		 */
		String circlePosition = "does not overlap";

		if (distance <= radius1 - radius2) {

			circlePosition = "inside";

		} else if (distance <= radius1 + radius2) {

			circlePosition = "overlaps";

		}

		/*
		 * Output result to console.
		 */
		System.out.println("");
		System.out.print("circle2 " + circlePosition + " circle1");

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
