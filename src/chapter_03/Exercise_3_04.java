package chapter_03;

import java.util.Scanner;

/**
 * Exercise **3.4
 *
 * (Random month) Write a program that randomly generates an integer between 1
 * and 12 and displays the English month names January, February, ...., December
 * for the numbers 1, 2, ...., 12, accordingly.
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public final class Exercise_3_04 {

	/**
	 * Private constructor so this utility class cannot be instantiated.
	 */
	private Exercise_3_04() {

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
		System.out.println("Exercise **3.4 - Random Month");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Generate a random integer between 1 - 12.
		 */
		int month = (int) (Math.random() * (13 - 1) + 1);

		/*
		 * Output result to console.
		 */
		System.out.print("\nThe english month for " + month + " is ");

		switch (month) {
		case 1:
			System.out.println("January.");
			break;
		case 2:
			System.out.println("Febuary.");
			break;
		case 3:
			System.out.println("March.");
			break;
		case 4:
			System.out.println("April.");
			break;
		case 5:
			System.out.println("May.");
			break;
		case 6:
			System.out.println("June.");
			break;
		case 7:
			System.out.println("July.");
			break;
		case 8:
			System.out.println("August.");
			break;
		case 9:
			System.out.println("September.");
			break;
		case 10:
			System.out.println("October.");
			break;
		case 11:
			System.out.println("November.");
			break;
		case 12:
			System.out.println("December.");
			break;
		default:
			System.out.println("\nError: No Month Found!");
			System.exit(0);
		}

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
