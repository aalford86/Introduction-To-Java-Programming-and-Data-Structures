package chapter_03;

import java.util.Scanner;

/**
 * Exercise 3.28
 *
 * (Geometry: Two Rectangles) Write a program that prompts the user to enter the
 * center x-, y-coordinates, width, and height of two rectangles and determines
 * whether the second rectangle is inside the first or overlaps with the first,
 * as shown in figure 3.9. Test your program to cover all cases.
 *
 * <pre>
 *
 * Here are the sample runs:
 *
 * Enter r1's center x-, y-coordinates, width, and height: 2.5 4 2.5 43
 * Enter r2's center x-, y-coordinates, width, and height: 1.5 5 0.5 3
 * r2 is inside r1
 *
 * Enter r1's center x-, y-coordinates, width, and height: 1 2 3 5.5
 * Enter r2's center x-, y-coordinates, width, and height: 3 4 4.5 5
 * r2 overlaps r1
 *
 * Enter r1's center x-, y-coordinates, width, and height: 1 2 3 3
 * Enter r2's center x-, y-coordinates, width, and height: 40 45 3 2
 * r2 does not overlap r1
 *
 * </pre>
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public class Exercise_3_28 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("Exercise 3.28 - Geometry: Two Rectangles");
		System.out.println("");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt user to enter the x- and y-coordinates, width, and height for the
		 * first rectangle.
		 */
		System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
		double x1 = consoleInput.nextDouble();
		double y1 = consoleInput.nextDouble();
		double width1 = consoleInput.nextDouble();
		double height1 = consoleInput.nextDouble();

		/*
		 * Prompt user to enter the x- and y-coordinates, width, and height for the
		 * second rectangle.
		 */
		System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
		double x2 = consoleInput.nextDouble();
		double y2 = consoleInput.nextDouble();
		double width2 = consoleInput.nextDouble();
		double height2 = consoleInput.nextDouble();

		String rectanglePosition = " does not overlap ";

		/*
		 * Determine if the rectangles are inside or overlap with each other, and set
		 * appropriate message.
		 */
		double xDistance = Math.abs(x1 - x2);
		double yDistance = Math.abs(y1 - y2);

		if (((width1 - width2) / 2 >= xDistance) && ((height1 - height2) / 2 >= yDistance)) {

			rectanglePosition = " is inside ";

		} else if (((width1 + width2) / 2 >= xDistance) && ((height1 + height2) / 2 >= yDistance)) {

			rectanglePosition = " overlaps ";

		}

		/*
		 * Display result to console.
		 */
		System.out.println("");
		System.out.print("r2" + rectanglePosition + "r1");

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
