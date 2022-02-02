package chapter_03;

import java.util.Scanner;

/**
 * Exercise *3.5
 *
 * (Find Future Dates) Write a program that prompts the user to enter an integer
 * for today's day of the week (Sunday is 0, Monday is 1, ...., and Saturday is
 * 6). Also prompt the user to enter the number of days after today for a future
 * day and display the future day of the week.
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public final class Exercise_3_05 {

	/**
	 * Private constructor so this utility class cannot be instantiated.
	 */
	private Exercise_3_05() {

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
		System.out.println("Exercise *3.5 - Find Future Dates");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt user to enter todays day, 0 - 6.
		 */
		System.out.print("\nEnter today's day: ");
		int day = consoleInput.nextInt();

		/*
		 * Prompt user to enter elapsed days.
		 */
		System.out.print("Enter the number of days elapsed since today: ");
		int elapsedDays = consoleInput.nextInt();

		/*
		 * Compute future day.
		 */
		int futureDay = (day + elapsedDays) % 7;

		/*
		 * Output results to console.
		 */
		System.out.print("\nToday is ");

		switch (day) {
		case 0:
			System.out.print("Sunday");
			break;
		case 1:
			System.out.print("Monday");
			break;
		case 2:
			System.out.print("Tuesday");
			break;
		case 3:
			System.out.print("Wednesday");
			break;
		case 4:
			System.out.print("Thursday");
			break;
		case 5:
			System.out.print("Friday");
			break;
		case 6:
			System.out.print("Saturday");
			break;
		default:
			System.out.println("\nError: No Day Found!");
			System.exit(0);
		}

		System.out.print(" and the future day is ");

		switch (futureDay) {
		case 0:
			System.out.print("Sunday");
			break;
		case 1:
			System.out.print("Monday");
			break;
		case 2:
			System.out.print("Tuesday");
			break;
		case 3:
			System.out.print("Wednesday");
			break;
		case 4:
			System.out.print("Thursday");
			break;
		case 5:
			System.out.print("Friday");
			break;
		case 6:
			System.out.print("Saturday");
			break;
		default:
			System.out.println("\nError: No Day Found!");
			System.exit(0);
		}

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
