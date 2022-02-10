package chapter_04;

import java.util.Scanner;

/**
 * Exercise *4.13
 *
 * (Vowel or consonant?) Write a program that prompts the user to enter a letter
 * and check whether the letter is a vowel or consonant. For a nonletter input,
 * display invalid input.
 *
 * <pre>
 *
 * Here is a sample run:
 *
 * Enter a letter: B B is a consonant
 *
 * Enter a letter: a a is a vowel
 *
 * Enter a letter: # # is an invalid input
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public class Exercise_4_13 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("\nExercise *4.13 - Vowel Or Consonant?\n");

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
		 * Set vowels.
		 */
		String vowels = "aeiou";

		/*
		 * Set consonants.
		 */
		String consonants = "bcdfghjklmnpqrstvwxpz";

		/*
		 * Determine if a vowel or consonant is found.
		 */
		boolean vowelFound = vowels.indexOf(letter.toLowerCase().charAt(0)) >= 0;
		boolean consonantFound = consonants.indexOf(letter.toLowerCase().charAt(0)) >= 0;

		/*
		 * Set appropriate display message if a vowel or consonant is found otherwise
		 * alert user to invalid input.
		 */
		String message = "";

		if (letter.length() != 1 || !(vowelFound || consonantFound)) {

			message = "an invalid input";

		} else if (vowelFound) {

			message = "a vowel";

		} else if (consonantFound) {

			message = "a consonant";

		}

		/*
		 * Display result to console.
		 */
		System.out.printf("%s is %s ", letter, message);

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
