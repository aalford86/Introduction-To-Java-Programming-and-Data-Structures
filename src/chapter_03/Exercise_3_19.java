package chapter_03;

import java.util.Scanner;

/**
 * Exercise **3.19
 *
 * (Compute The Perimeter Of A Triangle) Write a program that reads three edges
 * for a triangle and computes the perimeter if the input is valid. Otherwise,
 * display that the input is invalid. The input is valid if the sum of every
 * pair of two edges is greater than the remaining edge.
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public final class Exercise_3_19 {

	/**
	 * Private constructor so this utility class cannot be instantiated.
	 */
	private Exercise_3_19() {

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
		System.out.println("Exercise **3.19 - Compute The Perimeter Of A Triangle");
		System.out.println("");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt the user to enter the edges of a triangle.
		 */
		System.out.print("Enter the length of edge A: ");
		double a = consoleInput.nextDouble();

		System.out.print("Enter the length of edge B: ");
		double b = consoleInput.nextDouble();

		System.out.print("Enter the length of edge C: ");
		double c = consoleInput.nextDouble();

		/*
		 * Determine if the inputs are valid.
		 */
		if (a + b < c || b + c < a || c + a < b) {
			System.out.println("Invalid Inputs!");
		} else {
			System.out.println("The perimeter of the triangle is " + (a + b + c) + ".");
		}

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
