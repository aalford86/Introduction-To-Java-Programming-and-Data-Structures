package chapter_04;

import java.util.Scanner;

/**
 * Exercise 4.19
 *
 * (Business: check ISBN-10) Rewrite Programming Exercise 3.9 by entering the
 * ISBN number as a string.
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public class Exercise_4_19 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("\nExercise 4.19 - Business: Check ISBN-10\n");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt user to enter the first 9 digits of a ISBN number.
		 */
		System.out.print("\nEnter the first 9 digits of an ISBN: ");
		String isbnStr = consoleInput.nextLine();

		/*
		 * Parse ISBN string to an integer.
		 */
		int isbn = Integer.parseInt(isbnStr);

		/*
		 * Break down ISBN number into single digits.
		 */
		final int ten = 10;

		int d9 = isbn % ten;
		isbn /= ten;

		int d8 = isbn % ten;
		isbn /= ten;

		int d7 = isbn % ten;
		isbn /= ten;

		int d6 = isbn % ten;
		isbn /= ten;

		int d5 = isbn % ten;
		isbn /= ten;

		int d4 = isbn % ten;
		isbn /= ten;

		int d3 = isbn % ten;
		isbn /= ten;

		int d2 = isbn % ten;
		isbn /= ten;

		int d1 = isbn;

		/*
		 * Compute checksum for d10;
		 */
		int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

		/*
		 * Output result to console;
		 */
		System.out.printf("%nThe ISBN-10 number is %d%d%d%d%d%d%d%d%d", d1, d2, d3, d4, d5, d6, d7, d8, d9);

		if (d10 < ten) {
			System.out.println(d10);
		} else {
			System.out.println("X");
		}

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
