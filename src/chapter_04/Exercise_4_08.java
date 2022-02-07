package chapter_04;

import java.util.Scanner;

/**
 * Exercise *4.8
 *
 * (Find the character of an ASCII code) Write a program that receives an ASCII
 * code (an integer between 0 and 127) and displays its character.
 *
 * <pre>
 *
 * Here is a sample run:
 *
 * Enter an ASCII code: 69
 * The character for ASCII code 69 is E
 *
 * </pre>
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public class Exercise_4_08 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("\nExercise *4.8 - Find The Character Of An ASCII Code\n");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt user to enter an integer between 0 and 127 - ASCII code.
		 */
		System.out.print("Enter an ASCII code: ");
		int code = consoleInput.nextInt();

		/*
		 * Convert integer to a character.
		 */
		char ch = (char) code;

		/*
		 * Display result to console.
		 */
		System.out.printf("The character for ASCII code %d is %c", code, ch);

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
