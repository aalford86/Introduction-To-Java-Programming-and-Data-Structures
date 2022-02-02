package chapter_02;

import java.util.Scanner;

/**
 * Exercise *2.8
 *
 * (Current time) Listing 2.7, ShowCurrentTime.java, gives a program that
 * displays the current time in GMT. Revise the program so it prompts the user
 * to enter the time zone offset to GMT and displays the time in the specified
 * time zone.
 *
 * @Book Introduction to JAVA, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public final class Exercise_2_08 {

	/**
	 * Private constructor so this utility class cannot be instantiated.
	 */
	private Exercise_2_08() {

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
		System.out.println("Exercise *2.8 - Current Time");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt user to enter hour offset.
		 */
		System.out.print("\nEnter the time zone offset to GMT: ");
		int hourOffset = consoleInput.nextInt();

		/*
		 * Obtain the total milliseconds since midnight, Jan 1, 1970.
		 */
		long totalMilliseconds = System.currentTimeMillis();

		/*
		 * Obtain the total seconds since midnight, Jan 1, 1970.
		 */
		long totalSeconds = totalMilliseconds / 1000;

		/*
		 * Compute the current second in the minute in the hour.
		 */
		long currentSecond = totalSeconds % 60;

		/*
		 * Obtain the total minutes.
		 */
		long totalMinutes = totalSeconds / 60;

		/*
		 * Obtain the current minute in the hour.
		 */
		long currentMinute = totalMinutes % 60;

		/*
		 * Obtain the total hours.
		 */
		long totalHours = totalMinutes / 60;

		/*
		 * Obtain the current hour.
		 */
		long currentHour = totalHours % 24;

		/*
		 * Display results
		 */
		System.out.println("Current time is " + (currentHour + hourOffset) + ":" + currentMinute + ":" + currentSecond);

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
