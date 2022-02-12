package chapter_04;

import java.util.Scanner;

/**
 * Exercise *4.24
 *
 * (Order three cities) Write a program that prompts the user to enter three
 * cities and displays them in ascending order.
 *
 * <pre>
 *
 * Here is a sample run:
 *
 * Enter the first city: Chicago
 * Enter the second city: Los Angeles
 * Enter the third city: Atlanta
 * The three cities in alphabetical order are Atlanta Chicago Los Angeles
 *
 * </pre>
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public class Exercise_4_24 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("\nExercise *4.24 - Order Three Cities\n");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt user to enter first city.
		 */
		System.out.print("Enter the first city: ");
		String city1 = consoleInput.nextLine();

		/*
		 * Prompt user to enter second city.
		 */
		System.out.print("Enter the second city: ");
		String city2 = consoleInput.nextLine();

		/*
		 * Prompt user to enter third city.
		 */
		System.out.print("Enter the third city: ");
		String city3 = consoleInput.nextLine();

		/*
		 * Declare and initialize temp value.
		 */
		String temp = city1;

		/*
		 * Sort cities into alphabetical.
		 */
		if (city1.compareToIgnoreCase(city2) > 0) {

			temp = city1;
			city1 = city2;
			city2 = temp;

		}

		if (city2.compareToIgnoreCase(city3) > 0) {

			temp = city2;
			city2 = city3;
			city3 = temp;

		}

		if (city1.compareToIgnoreCase(city2) > 0) {

			temp = city1;
			city1 = city2;
			city2 = temp;

		}

		/*
		 * Display results to console.
		 */
		System.out.printf("%nThe three cities in alphabetical order are %s, %s, and %s.", city1, city2, city3);

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
