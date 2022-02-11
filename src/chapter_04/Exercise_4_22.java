package chapter_04;

import java.util.Scanner;

/**
 * Exercise 4.22
 *
 * (Check substring) Write a program that prompts the user to enter two strings,
 * and reports whether the second string is a substring of the first string.
 *
 * <pre>
 *
 * Here is a sample run.
 *
 * Enter string s1: ABCD
 * Enter string s2: BC
 * BC is a substring of ABCD
 *
 * Enter string s1: ABCD
 * Enter string s2: BDC
 * BDC is not a substring of ABCD
 *
 * </pre>
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public class Exercise_4_22 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("\nExercise 4.22 - Check Substring\n");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt user to enter string one.
		 */
		System.out.print("Enter string s1: ");
		String s1 = consoleInput.nextLine();

		/*
		 * Prompt user to enter string two.
		 */
		System.out.print("Enter string s2: ");
		String s2 = consoleInput.nextLine();

		/*
		 * Check if s2 is a substring of s1.
		 */
		boolean isSubstring = s1.contains(s2);

		/*
		 * Set substring message.
		 */
		String substring = isSubstring ? "is" : "is not";

		/*
		 * Display result to console.
		 */
		System.out.printf("%n%s %s a substring of %s", s2, substring, s1);

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
