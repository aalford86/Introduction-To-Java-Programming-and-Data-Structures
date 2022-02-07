package chapter_04;

import java.util.Scanner;

/**
 * Exercise *4.9
 *
 * (Find The Unicode Of A Character) Write a program that receives a character
 * and displays its Unicode.
 *
 * <pre>
 *
 * Here is a sample run:
 *
 * Enter a character: E
 * The Unicode for the character E is 69
 *
 * </pre>
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public class Exercise_4_09 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("\nExercise *4.9 Find The Unicode Of A Character\n");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt user to enter a character to find the Unicode for.
		 */
		System.out.print("Enter a character: ");
		String userInput = consoleInput.nextLine();

		/*
		 * Get the first character from the string userInput.
		 */
		char ch = userInput.charAt(0);

		/*
		 * Convert the character to Unicode.
		 */
		int code = ch;

		/*
		 * Display result to console.
		 */
		System.out.printf("The Unicode for the character %c is %d", ch, code);

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
