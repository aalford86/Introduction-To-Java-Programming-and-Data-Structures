package chapter_02;

import java.util.Scanner;

/**
 * Exercise *2.17
 *
 * (Science: Wind-Chill Temperature) How cold is it outside? The temperature
 * alone is not enough to provide the answer. Other factor including wind speed,
 * relative humidity, and sunshine play important roles in determining coldness
 * outside. In 2001, the National Weather Service (NWS) implemented the new
 * wind-chill temperature to measure the coldness using temperature and wind
 * speed. The formula is
 *
 * <pre>
 *
 * Formula:
 *
 * twc = 35.74 + 0.6215ta - 35.75v^0.16 + 0.4275tav^0.16
 *
 * </pre>
 *
 * where ta is the outside temperature measured in degrees Fahrenheit, v is the
 * speed measured in miles per hour, and twc is the wind-chill temperatures
 * below -58 degrees Fahrenheit or above 41 degrees Fahrenheit.
 *
 * Write a program that prompts the user to enter a temperature between -58 and
 * 41 degrees Fahrenheit and a wind speed greater than or equal to 2 then
 * displays the wind-chill temperature. Use Math.pow(a, b) to compute v^0.16.
 *
 * @Book Introduction to JAVA, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public final class Exercise_2_17 {

	/**
	 * Private constructor so this utility class cannot be instantiated.
	 */
	private Exercise_2_17() {

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
		System.out.println("Exercise *2.17 - Science: Wind-Chill Temperature");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt the user to enter the temperature in Fahrenheit between -58 and 41
		 * degrees.
		 */
		System.out.print("\nEnter the temperature in Fahrenheit between -58 and 41 degrees: ");
		float ta = consoleInput.nextFloat(); // Temperature(ta)

		/*
		 * Prompt the user to enter the wind speed greater than equal to 2 MPH.
		 */
		System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
		float v = consoleInput.nextFloat(); // Wind Speed (v)

		/*
		 * Compute the wind chill.
		 */
		double twc = 35.74 + 0.6215 * ta - 35.75 * Math.pow(v, 0.16) + 0.4275 * ta * Math.pow(v, 0.16);

		/*
		 * Output results to console.
		 */
		System.out.print("The wind chill index is " + twc);

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
