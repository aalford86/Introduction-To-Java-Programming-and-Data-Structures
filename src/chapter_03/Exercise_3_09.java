package chapter_03;

import java.util.Scanner;

/**
 * Exercise **3.9
 *
 * (Business: check ISBN-10) An ISBN-10 (International Standard Book Number)
 * consists of 10 digits: d1d2d3d4d5d6d7d8d9d10. The last digit, d10, is a
 * checksum, which is calculated from the other 9 digits using the following
 * formula:
 *
 * <pre>
 *
 * Formula:
 *
 * (d1 x 1 + d2 x 2 + d3 x3 + d4 x 4 + d5 x 5 + d6 x 6 + d7 x 7 + d8 x 8 + d9 x 9) % 11
 *
 * </pre>
 *
 * If the checksum is 10, the last digit is denoted as X according to the
 * ISBN-10 convention. Write a program that prompts the user to enter the first
 * 9 digits and displays the 10-digit ISBN (including leading zeros). Your
 * program should read the input as an integer.
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public final class Exercise_3_09 {

	/**
	 * Private constructor so this utility class cannot be instantiated.
	 */
	private Exercise_3_09() {

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
		System.out.println("Exercsie **3.9 - Business: Check ISBN-10");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt user to enter the first 9 digits of a ISBN number.
		 */
		System.out.print("\nEnter the first 9 digits of an ISBN as integer: ");
		int isbn = consoleInput.nextInt();

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
		System.out.print("\nThe ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9);

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
