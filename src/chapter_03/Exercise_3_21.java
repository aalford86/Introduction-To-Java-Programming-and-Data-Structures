package chapter_03;

import java.util.Scanner;

/**
 * Exercise **3.21
 *
 * (Science: Day Of The Week) Zeller's congruence is an algorithm developed by
 * Christian Zeller to calculate the day of the week.
 *
 * <pre>
 *
 * The formula:
 *
 *            26(m + 1)         k     j
 * h = ( q + ----------- + k + --- + --- + 5j ) % 7
 *                10            4     4
 *
 *
 * where,
 *
 * - h is the day of the week (0: Saturday; 1: Sunday; 2: Monday; 3: Wednesday,
 *     4: Thursday, and 6 Friday).
 *
 * - q is the day of the month.
 *
 * - m is the month (3: March, 4: April, ... , 12: December). January and
 *     February are counted as months 13 and 14 of the previous year.
 *
 *         year
 * - j is ------
 *         100
 *
 * - k is the year of the century (i.e., year % 100;
 *
 * </pre>
 *
 * Note all divisions in this exercise perform an integer division. Write a
 * program that prompts the use to enter a year, month, and day of the month,
 * and displays the name of the day of the week.
 *
 * <pre>
 *
 * Here are some sample runs:
 *
 * Enter year: (e.g., 2012): 2015
 * Enter month: 1-12: 1
 * Enter the day of the month: 1-31: 25
 * Day of the week is Sunday
 *
 * Enter year: (e.g., 2012): 2012
 * Enter month: 1-12: 5
 * Enter the day of the month: 1-31: 12
 * Day of the week is Saturday
 *
 * </pre>
 *
 * (Hint: January and February are counted as 13 and 14 in the formula, so you
 * need to convert the user input 1 to 13 and 2 to 14 for the month and change
 * the year to the previous year.)
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public class Exercise_3_21 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("Exercise **3.21 - Science: Day Of The Week");
		System.out.println("");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt the user to enter the year.
		 */
		System.out.print("Enter year (e.g., 2012): ");
		int year = consoleInput.nextInt();

		/*
		 * Prompt the user to enter the month.
		 */
		System.out.print("Enter month 1 - 12: ");
		int m = consoleInput.nextInt();

		/*
		 * January and February are counted as 13 and 14 of the previous year in the
		 * formula, adjust m and year to account for this.
		 */
		if (m == 1 || m == 2) {
			m += 12;
			year--;
		}

		/*
		 * Prompt the user to enter the day of the month.
		 */
		System.out.print("Enter the day of the month 1 - 31: ");
		int q = consoleInput.nextInt();

		/*
		 * Declare and set variables j and k.
		 */
		int j = year / 100; // The century.
		int k = year % 100; // The year of the century.

		/*
		 * Compute the numeric number for day of the week.
		 */
		int h = (q + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;

		/*
		 * Declare string to hold name of day.
		 */
		String weekDayStr = "";

		/*
		 * Set the day of the week for display to console.
		 */
		switch (h) {
		case 0:
			weekDayStr = "Saturday";
			break;
		case 1:
			weekDayStr = "Sunday";
			break;
		case 2:
			weekDayStr = "Monday";
			break;
		case 3:
			weekDayStr = "Tuesday";
			break;
		case 4:
			weekDayStr = "Wenesday";
			break;
		case 5:
			weekDayStr = "Thursday";
			break;
		case 6:
			weekDayStr = "Friday";
			break;
		default:
			System.out.println("Error: No week day found!");
			System.out.println("Terminate Program...");
			System.exit(1);
		}

		/*
		 * Display result to console.
		 */
		System.out.println("Day of the week is " + weekDayStr + ".");

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
