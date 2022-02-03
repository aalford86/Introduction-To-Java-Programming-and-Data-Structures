package chapter_03;

import java.util.Scanner;

/**
 * Exercise *3.20
 *
 * (Science: Wind-Chill Temperature) Programming Exercise 2.17 gives a formula
 * to compute the wind-chill temperature. The formula is valid for temperatures
 * in the range between -58 degrees Fahrenheit and 41 degrees Fahrenheit and
 * wind speed greater than or equal to 2. Write a program that prompts the user
 * to enter a temperature and a wind speed. The program displays the wind-chill
 * temperature if the input is valid; otherwise, it displays a message
 * indicating whether the temperature and/or wind speed is invalid.
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public class Exercise_3_20 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("Exercise *3.20 - Science: Wind-Chill Temperature");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt the user to enter the temperature in Fahrenheit between -58 and 41
		 * degrees.
		 */
		System.out.print("\nEnter the temperature in Fahrenheit between -58 and 41 degrees: ");
		double ta = consoleInput.nextFloat(); // Temperature(ta)

		/*
		 * Declare and set constants for the minimum and maximum temperature which can
		 * be used in the wind-chill formula.
		 */
		final double MINIMUM_TEMPERATURE = -58.0;
		final double MAXIMUM_TEMPERATURE = 41.0;

		/*
		 * Check the user input for temperature if the value is below -58 or above 41
		 * degrees provide error message to user and terminate program.
		 */
		if (ta < MINIMUM_TEMPERATURE || ta > MAXIMUM_TEMPERATURE) {
			System.out.println("Invalid Temperature: Temperature must be in the range -58 - 41 degrees Fahrenheit. ");
			System.out.println("Terminate Program...");
			System.exit(1);
		}

		/*
		 * Prompt the user to enter the wind speed greater than equal to 2 MPH.
		 */
		System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
		double v = consoleInput.nextFloat(); // Wind Speed (v)

		/*
		 * Declare and set the minimum wind speed which can be used in the wind-chill
		 * formula.
		 */
		final double MINIMUM_WIND_SPEED = 2.0;

		/*
		 * Check the user input for wind speed if the value is below 2 mph provide error
		 * message to user and terminate program.
		 */
		if (v < MINIMUM_WIND_SPEED) {
			System.out.println("Invalid Wind Speed: Wind Speed must be greater than equal to 2 mph. ");
			System.out.println("Terminate Program...");
			System.exit(1);
		}

		/*
		 * Compute the wind chill.
		 */
		double twc = 35.74 + 0.6215 * ta - 35.75 * Math.pow(v, 0.16) + 0.4275 * ta * Math.pow(v, 0.16);

		/*
		 * Output results to console.
		 */
		System.out.println("");
		System.out.println("The wind chill index is " + twc);

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
