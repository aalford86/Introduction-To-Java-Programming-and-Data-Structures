package chapter_03;

import java.util.Scanner;

/**
 * Exercise *3.3
 *
 * (Algebra: Solve 2 x 2 linear equations) A linear equation can be solved using
 * Cramer's rule given inProgramming Exercise 1.13. Write a program that prompts
 * the user to enter a, , c, d, e, and f and displays the result. If ad - bc is
 * 0, report that "The equation has no solution."
 *
 * @Book Introduction to JAVA, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public final class Exercise_3_03 {

	/**
	 * Private constructor so this utility class cannot be instantiated.
	 */
	private Exercise_3_03() {

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
		System.out.println("Exercise *3.3 - Algebra: Solve 2 X 2 Linear Equations");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt user for values of a, b, c, d, e, and f.
		 */
		System.out.print("\nEnter the value for a, b, c, d, e, and f: ");
		double a = consoleInput.nextDouble();
		double b = consoleInput.nextDouble();
		double c = consoleInput.nextDouble();
		double d = consoleInput.nextDouble();
		double e = consoleInput.nextDouble();
		double f = consoleInput.nextDouble();

		/*
		 * Declare x and y.
		 */
		double x, y = 0;

		/*
		 * Compute ad - bc.
		 */
		double denominator = a * d - b * c;

		if (denominator == 0) {

			System.out.println("The equation has no solutions!");

		} else {
			x = (e * d - b * f) / denominator;
			y = (a * f - e * c) / denominator;

			System.out.println("x is " + x + " and y is " + y);
		}

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
