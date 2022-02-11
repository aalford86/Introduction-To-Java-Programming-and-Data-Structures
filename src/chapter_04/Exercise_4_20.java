package chapter_04;

import java.util.Scanner;

/**
 * Exercise 4.20
 *
 * (Process a string) Write a program that prompts the user to enter a string
 * and displays its length and its first character
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public class Exercise_4_20 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("\nExercise 4.20 - Process A String\n");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt the user to enter a string.
		 */
		System.out.print("Enter a string: ");
		String userInput = consoleInput.nextLine();

		/*
		 * Get the length of the string from user input.
		 */
		int length = userInput.length();

		/*
		 * If the userInput string has at least 1 character get the first character of
		 * the string. Display result to console.
		 */
		if (length > 0) {

			/*
			 * Get first character from the string - userInput.
			 */
			char firstChar = userInput.charAt(0);

			System.out.printf("%nThe string length is %d and the first character is %c", length, firstChar);

		} else {

			System.out.print("Empty string.");

		}

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
