package chapter_02;

import java.util.Scanner;

/**
 * Exercise *2.7
 *
 * (Find The Number Of Years) Write a program that prompts the user to enter the
 * minutes (e.g, 1 billion), and displays the number of years and remaining days
 * for the minutes. For simplicity, assume that a year has 365 days.
 *
 * @Book Introduction to JAVA, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public final class Exercise_2_07 {

	/**
	 * Private constructor so this utility class cannot be instantiated.
	 */
	private Exercise_2_07() {

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
		System.out.println("Exercise *2.7 - Find The Number Of Years");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt user to enter minutes.
		 */
		System.out.print("\nEnter the number of minutes: ");
		int minutes = consoleInput.nextInt();

		/*
		 * Set minutes per day.
		 */
		final int MINUTES_PER_DAY = 60 * 24;

		/*
		 * Compute the total days given the user defined minute amount.
		 */
		int totalDays = minutes / MINUTES_PER_DAY;

		/*
		 * Compute the number of years.
		 */
		int totalYears = totalDays / 365;

		/*
		 * Compute remaining days.
		 */
		int remainingDays = totalDays % 365;

		/*
		 * Output result to console.
		 */
		System.out.println(minutes + " minutes is approximately " + totalYears + " and " + remainingDays + " days.");

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
