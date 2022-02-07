package chapter_04;

import java.util.Scanner;

/**
 * Exercise 4.4
 *
 * (Geometry: area of a hexagon) The area of a hexagon can be computed using the
 * following formula (s is the length of a side):
 *
 * <pre>
 *
 *             6 x s^2
 * Area = -----------------
 *         4 x tan(pi / 6)
 *
 * </pre>
 *
 * Write a program that prompts the user to enter the side of a hexagon and
 * displays its area.
 *
 * <pre>
 *
 *  Here is a sample run:
 *
 * Enter the side: 5.5
 * The area of the hexagon is 78.59
 *
 * </pre>
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public class Exercise_4_04 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("\nExercise 4.4 - Geometry: Area Of A Hexagon\n");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt the user to enter the length of the hexagon's side.
		 */
		System.out.print("Enter the side: ");
		double s = consoleInput.nextDouble();

		/*
		 * Compute the area of the hexagon.
		 */
		double area = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6));

		/*
		 * Display result to console.
		 */
		System.out.printf("The area of the hexagon is %,.2f", area);

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
