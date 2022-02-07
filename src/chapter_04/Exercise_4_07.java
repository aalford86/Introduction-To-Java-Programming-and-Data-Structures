package chapter_04;

import java.util.Scanner;

/**
 * Exercise *4.7
 *
 * (Corner Point Coordinates) Suppose a pentagon is centered at (0, 0) with one
 * point at the 0 o’clock position, as shown in Figure 4.4c. Write a program
 * that prompts the user to enter the radius of the bounding circle of a
 * pentagon and displays the coordinates of the five corner points on the
 * pentagon from p1 to p5 in this order. Use console format to display two
 * digits after the decimal point.
 *
 * <pre>
 *
 * Here is a sample run:
 *
 * Enter the radius of the bounding circle: 100.52
 * The coordinates of five points on the pentagon are
 * (95.60, 31.06)
 * (0.00, 100.52)
 * (−95.60, 31.06)
 * (−58.08, −81.32)
 * (59.08, −81.32)
 *
 * </pre>
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public class Exercise_4_07 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("\nExercise *4.7 - Corner Point Coordinates\n");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt user to enter the radius.
		 */
		System.out.print("Enter the radius of the bounding circle: ");
		double radius = consoleInput.nextDouble();

		/*
		 * Declare and initialize variable to hold angle in radians.
		 */
		double angle = 0.0;

		/*
		 * Set angle for point 1.
		 */
		angle = Math.toRadians(18);
		double point1x = radius * Math.cos(angle);
		double point1y = radius * Math.sin(angle);

		/*
		 * Set angle for point 2.
		 */
		angle = Math.toRadians(90);
		double point2x = radius * Math.cos(angle);
		double point2y = radius * Math.sin(angle);

		/*
		 * Set angle for point 3.
		 */
		angle = Math.toRadians(162);
		double point3x = radius * Math.cos(angle);
		double point3y = radius * Math.sin(angle);

		/*
		 * Set angle for point 4.
		 */
		angle = Math.toRadians(234);
		double point4x = radius * Math.cos(angle);
		double point4y = radius * Math.sin(angle);

		/*
		 * Set angle for point .5
		 */
		angle = Math.toRadians(306);
		double point5x = radius * Math.cos(angle);
		double point5y = radius * Math.sin(angle);

		/*
		 * Display result to console.
		 */
		System.out.printf("%nPoint 1: (%,.2f , %,.2f)", point1x, point1y);
		System.out.printf("%nPoint 2: (%,.2f , %,.2f)", point2x, point2y);
		System.out.printf("%nPoint 3: (%,.2f , %,.2f)", point3x, point3y);
		System.out.printf("%nPoint 4: (%,.2f , %,.2f)", point4x, point4y);
		System.out.printf("%nPoint 5: (%,.2f , %,.2f)", point5x, point5y);

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
