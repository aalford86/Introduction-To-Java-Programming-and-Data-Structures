package chapter_04;

import java.util.Scanner;

/**
 * Exercise *4.17 (Days of a month) Write a program that prompts the user to
 * enter the year and the first three letters of a month name (with the first
 * letter in uppercase) and displays the number of days in the month. If the
 * input for month is incorrect, display a message as presented in the following
 * sample runs:
 *
 * <pre>
 *
 * Here is a sample run.
 *
 * Enter a year: 2001
 * Enter a month: Jan
 * Jan 2001 has 31 days
 *
 * Enter a year: 2016
 * Enter a month: jan
 * jan is not a correct month name
 *
 * </pre>
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public class Exercise_4_17 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("\nExercise *4.17 - Days Of A Month\n");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt user to enter year.
		 */
		System.out.print("Enter a year: ");
		String yearStr = consoleInput.nextLine();

		/*
		 * Prompt user to enter a month.
		 */
		System.out.print("Enter a month: ");
		String month = consoleInput.nextLine();

		/*
		 * Parse user input for year into a integer.
		 */
		int year = Integer.parseInt(yearStr);

		/*
		 * Determine if year will be a leap year.
		 */
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

		/*
		 * Find days if month is a valid entry otherwise display error message and
		 * terminate program.
		 */
		String days = "";

		switch (month) {
		case "Jan":
			days = "31";
			break;
		case "Feb":
			days = isLeapYear ? "29" : "28";
			break;
		case "Mar":
			days = "31";
			break;
		case "Apr":
			days = "30";
			break;
		case "May":
			days = "31";
			break;
		case "Jun":
			days = "30";
			break;
		case "Jul":
			days = "31";
			break;
		case "Aug":
			days = "31";
			break;
		case "Sep":
			days = "30";
			break;
		case "Oct":
			days = "31";
			break;
		case "Nov":
			days = "30";
			break;
		case "Dec":
			days = "31";
			break;
		default:
			System.out.printf("%n%s is not a correct month name", month);
			System.out.print("\nTerminate Program...");
			System.exit(1);
		}

		/*
		 * Display result to console.
		 */
		System.out.printf("%n%s %d has %s days", month, year, days);

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
