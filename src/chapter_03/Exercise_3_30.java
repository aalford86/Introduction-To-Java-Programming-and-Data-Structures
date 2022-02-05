package chapter_03;

import java.util.Scanner;

/**
 * Exercise *3.30
 *
 * (Current Time) Revise Programming Exercise 2.8 to display the hour using a
 * 12-hour clock.
 *
 * <pre>
 *
 * Enter the time zone offset to GMT: -5
 * The current time is 4:50:34 AM
 *
 * </pre>
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public class Exercise_3_30 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("Exercise *3.30 - Current Time");

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
		long currentHour = (totalHours + hourOffset) % 24;

		/*
		 * Switch clock to 12 hour format and set display message for meridiem.
		 */
		String meridiem = "AM";

		if (currentHour > 12) {
			currentHour -= 12;
			meridiem = "PM";
		}

		/*
		 * Display results
		 */
		System.out.println(
				"Current time is " + (currentHour) + ":" + currentMinute + ":" + currentSecond + " " + meridiem);

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
