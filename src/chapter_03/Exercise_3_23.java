package chapter_03;

import java.util.Scanner;

/**
 * Exercise **3.23
 *
 * (Geometry: Point In A Rectangle?) Write a program that prompts the user to
 * enter a point (x, y) and checks whether the point is within the rectangle
 * centered at (0, 0) with width 10 and height 5. For example, (2, 2) is inside
 * the rectangle and (6, 4) is outside the rectangle, as shown in Figure 3.7b.
 * (Hint: A point is in the rectangle if its horizontal distance to (0, 0) is
 * less than or equal to 10 / 2 and its vertical distance to (0, 0) is less than
 * or equal to 5.0 / 2. Test your program to cover all cases.)
 *
 * <pre>
 *
 * Here are two sample runs:
 *
 * Enter a point with two coordinates: 2 2
 * Point (2.0, 2.0) is in the rectangle
 *
 * Enter a point with two coordinates: 6 4
 * Point (6.0, 4.0) is not in the rectangle
 *
 * </pre>
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public class Exercise_3_23 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("Exercise **3.23 - Geometry: Point In A Rectangle?");
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
		 * Declare and set width and height for rectangle.
		 */
		final double RECTANGLE_WIDTH = 10.0;
		final double RECTANGLE_HEIGHT = 5.0;

		/*
		 * Determine if user defined point is inside the rectangle or not. Set message
		 * if point is or is not in rectangle.
		 */
		String inRectangle = "";

		if (Math.abs(xCoord) <= RECTANGLE_WIDTH / 2 && Math.abs(yCoord) <= RECTANGLE_HEIGHT / 2) {
			inRectangle = " is ";
		} else {
			inRectangle = " is not ";
		}

		/*
		 * Display result to console.
		 */
		System.out.print("Point (" + xCoord + ", " + yCoord + ")" + inRectangle + "in the rectangle.");

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
