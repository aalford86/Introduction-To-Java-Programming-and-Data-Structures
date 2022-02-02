package chapter_03;

import java.util.Scanner;

/**
 * Exercise *3.1
 *
 * (Algebra: solve quadratic equations) The two roots of a quadratic equation
 * ax^2 + bx + c = 0 can be obtained using the following formula:
 *
 * <pre>
 *
 *       -b + sqrt(b^2 - 4ac
 * r1 = ---------------------
 *                2a
 *
 *       -b - sqrt(b^2 - 4ac
 * r2 = ---------------------
 *                2a
 *
 * </pre>
 *
 * b^2 - 4ac is called the discriminant of the quadratic equation. If it is
 * positive, the equation has two real roots. If it is zero, the equation has
 * one root. if it is negative, the equation has no real roots.
 *
 * Write a program that prompts the user to enter values for a, b, and c and
 * displays the result based on the discriminant. If the discriminant is
 * positive, display two roots, If the discriminant is 0, display one root.
 * otherwise, display "The equation has no real roots."
 *
 * Note you can use Math.pow(x, 0.5) to compute sqrt(x).
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */

public final class Exercise_3_01 {

	/**
	 * Private constructor so this utility class cannot be instantiated.
	 */
	private Exercise_3_01() {

	}

	/**
	 * Main method.
	 *
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("Exercise *3.1 - Algebra: Solve Quadratic Equations");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt the user to enter a, b, and c values for the quadratic equations.
		 */
		System.out.print("\nEnter a, b, c: ");
		double a = consoleInput.nextDouble();
		double b = consoleInput.nextDouble();
		double c = consoleInput.nextDouble();

		/*
		 * Compute the discriminant.
		 */
		double discriminant = Math.pow(b, 2) - 4 * a * c;

		/*
		 * Compute the roots for the quadratic equations.
		 */
		double r1 = 0;
		double r2 = 0;

		if (discriminant > 0) {

			r1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
			r2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);

			System.out.println("The equation has two roots " + r1 + " and " + r2);

		} else if (discriminant == 0) {

			r1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);

			System.out.println("The equation has one root " + r1);

		} else {

			System.out.println("The equation has no real roots.");

		}

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
