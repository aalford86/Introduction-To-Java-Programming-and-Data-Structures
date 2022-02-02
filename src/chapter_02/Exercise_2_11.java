package chapter_02;

import java.util.Scanner;

/**
 * Exercise 2.11
 *
 * (Population projection) Rewrite Programming Exercsie 1.11 to prompt the user
 * to enter the number of years and display the population after the number of
 * years. Use the hint in Programming Exercise 1.11 for this program.
 *
 * Exercise 1.11
 *
 * (Population projection) The U.S. Census Bureau projects population based on
 * the following assumptions:
 *
 * <pre>
 * One birth every 7 seconds
 * One death every 13 seconds
 * One new immigrant every 45 seconds
 * </pre>
 *
 * Write a program to display the population for each of the next five years.
 * Assume that the current population is 312,032,486, and one year has 365 days.
 * Hint: In Java, if two integers perform division, the result is an integer.
 * The fractional part is truncated. For example, 5/4 is 1 (not 1.25) and 10/4
 * is 2 (not 2.5). To get an accurate result with the fractional part, one of
 * the values involved in the division must be a number with a decimal point.
 * For example, 5.0/4 is 1.25 and 10/4.0 is 2.5.
 *
 * @Book Introduction to JAVA, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 */
public final class Exercise_2_11 {

	/**
	 * Default constructor--private to prevent instantiation.
	 */
	private Exercise_2_11() {

	}

	/**
	 * Main method.
	 *
	 * @param args the command line arguments; unused here
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("Exercise 2.11: Population Projection");

		/*
		 * Open input stream object.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt user to enter the year for projection model.
		 */
		System.out.print("\nEnter the number of years: ");
		int years = consoleInput.nextInt();

		/*
		 * Compute population projection.
		 */
		final int SECONDS_PER_YEAR = 60 * 60 * 24 * 365;
		int initialPopulation = 312_032_486;
		int newBirth = SECONDS_PER_YEAR / 7;
		int death = SECONDS_PER_YEAR / 13;
		int immigrant = SECONDS_PER_YEAR / 45;
		int populationProjection = (initialPopulation + years * ((newBirth) - (death) + (immigrant)));

		/*
		 * Output message to console.
		 */
		System.out.println("The population in " + years + " years is " + populationProjection + ".");

		/*
		 * Close console output stream.
		 */
		consoleInput.close();
	}

}
