package chapter_04;

import java.util.Scanner;

/**
 * Exercise *4.15 (Phone key pads) The international standard letter/number
 * mapping found on the telephone is shown below:
 *
 * Write a program that prompts the user to enter a lowercase or uppercase
 * letter and displays its corresponding number. For a nonletter input, display
 * invalid input.
 *
 * <pre>
 *
 * Here is a sample run:
 *
 * Enter a letter: A
 * The corresponding number is 2
 *
 * Enter a letter: a
 * The corresponding number is 2
 *
 * Enter a letter: +
 * + is an invalid input
 *
 * </pre>
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public class Exercise_4_15 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("\nExercise *4.15 - Phone Key Pads\n");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt user to enter a letter.
		 */
		System.out.print("Enter a letter: ");
		String letter = consoleInput.nextLine();

		/*
		 * Find number that corresponds to the letter.
		 */
		int numericValue = 0;

		switch (letter.toLowerCase()) {
		case "a":
			numericValue = 2;
			break;
		case "b":
			numericValue = 2;
			break;
		case "c":
			numericValue = 2;
			break;
		case "d":
			numericValue = 3;
			break;
		case "e":
			numericValue = 3;
			break;
		case "f":
			numericValue = 3;
			break;
		case "g":
			numericValue = 4;
			break;
		case "h":
			numericValue = 4;
			break;
		case "i":
			numericValue = 4;
			break;
		case "j":
			numericValue = 5;
			break;
		case "k":
			numericValue = 5;
			break;
		case "l":
			numericValue = 5;
			break;
		case "m":
			numericValue = 6;
			break;
		case "n":
			numericValue = 6;
			break;
		case "o":
			numericValue = 6;
			break;
		case "p":
			numericValue = 7;
			break;
		case "q":
			numericValue = 7;
			break;
		case "r":
			numericValue = 7;
			break;
		case "s":
			numericValue = 7;
			break;
		case "t":
			numericValue = 8;
			break;
		case "u":
			numericValue = 8;
			break;
		case "v":
			numericValue = 8;
			break;
		case "w":
			numericValue = 9;
			break;
		case "x":
			numericValue = 9;
			break;
		case "y":
			numericValue = 9;
			break;
		case "z":
			numericValue = 9;
			break;
		default:
			System.out.printf("%n%s is an invalid input", letter);
			System.exit(1);
		}

		/*
		 * Display result to console.
		 */
		System.out.printf("%nThe corresponding number is %s", numericValue);

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
