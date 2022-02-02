package chapter_03;

import java.util.Scanner;

/**
 * Exercise *3.11
 *
 * (Find the number of days in a month) Write a program that prompts the user to
 * enter the month and year and displays the number of days in the month. For
 * example, if the user entered month 2 and year 2012, the program should
 * display the February 2012 has 29 days. if the user entered month 3 and year
 * 2015, the program should display that March 2015 has 31 days.
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public final class Exercise_3_11 {

	/**
	 * Private constructor so this utility class cannot be instantiated.
	 */
	private Exercise_3_11() {

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
		System.out.println("Exercise *3.11 - Find The Number Of Days In A Month");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt user to enter the month for which to find days.
		 */
		System.out.print("\nEnter the month: ");
		int month = consoleInput.nextInt();

		/*
		 * Prompt user to enter the year.
		 */
		System.out.print("Enter the year: ");
		int year = consoleInput.nextInt();

		/*
		 * Determine if year will be a leap year.
		 */
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

		/*
		 * Determine days in the month for given year. If user has entered an invalid
		 * month terminate program.
		 */
		String monthStr = "";
		int days = 0;

		switch (month) {
		case 1:
			monthStr = "January";
			days = 31;
			break;
		case 2:
			monthStr = "February";
			days = isLeapYear ? 29 : 28;
			break;
		case 3:
			monthStr = "March";
			days = 31;
			break;
		case 4:
			monthStr = "April";
			days = 30;
			break;
		case 5:
			monthStr = "May";
			days = 31;
			break;
		case 6:
			monthStr = "June";
			days = 30;
			break;
		case 7:
			monthStr = "July";
			days = 31;
			break;
		case 8:
			monthStr = "August";
			days = 31;
			break;
		case 9:
			monthStr = "September";
			days = 30;
			break;
		case 10:
			monthStr = "October";
			days = 31;
			break;
		case 11:
			monthStr = "November";
			days = 30;
			break;
		case 12:
			monthStr = "December";
			days = 31;
			break;
		default:
			System.out.println("\nInvalid Entry for Month!");
			System.out.println("Program Terminated...");
			System.exit(1);
		}

		/*
		 * Display results to console.
		 */
		System.out.println("\n" + monthStr + " " + year + ", had " + days + " days.");

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
