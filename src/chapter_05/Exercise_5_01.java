package chapter_05;

import java.util.Scanner;

/**
 * Exercise *5.1
 *
 * (Count positive and negative numbers and compute the average of numbers)
 * Write a program that reads an unspecified number of integers, determines how
 * many positive and negative values have been read, and computes the total and
 * average of the input values (not counting zeros). Your program ends with the
 * input 0. Display the average as a floating-point number.
 *
 * <pre>
 *
 * Here are sample runs:
 *
 * Enter an integer, the input ends if it is 0: 1 2 –1 3 0
 * The number of positives is 3
 * The number of negatives is 1
 * The total is 5.0
 * The average is 1.25
 *
 * Enter an integer, the input ends if it is 0: 0
 * No numbers are entered except 0
 *
 * </pre>
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public class Exercise_5_01 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("\nExercise *5.1 - Count Positive And Negative Numbers\n");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt user to enter integers input ends when 0 is entered.
		 */
		System.out.print("Enter an integer, the input ends if it is 0: ");

		/*
		 * Declare and initialize variables needed in the do-while loop.
		 */
		int userInput = 0;
		int positive = 0;
		int negative = 0;
		double sum = 0;

		/*
		 * Check each integer entered by user and continue until user enters 0.
		 */
		do {

			userInput = consoleInput.nextInt();

			/*
			 * Check if user entered a positive or negative integer then increment the
			 * appropriate variable.
			 */
			if (userInput > 0) {

				positive++;

			} else if (userInput < 0) {

				negative++;

			}

			/*
			 * Sum all integers entered by user.
			 */
			sum += userInput;

		} while (userInput != 0);

		/*
		 * Display result to console.
		 */
		if (sum > 0) {

			/*
			 * Compute the average for the sum of integers.
			 */
			double average = sum / (positive + negative);

			System.out.printf("The number of positives is %d", positive);
			System.out.printf("%nThe number of negatives is %d", negative);
			System.out.printf("%nThe total is %,.1f", sum);
			System.out.printf("%nThe average is %,.2f", average);

		} else {

			System.out.println("No numbers are entered except 0");

		}

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
