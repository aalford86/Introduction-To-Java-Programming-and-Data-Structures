package chapter_02;

import java.util.Scanner;

/**
 * Exercise 2.10
 *
 * (Science: calculating energy) Write a program that calculates the energy
 * needed to heat water from an initial temperature to a final temperature. Your
 * program should prompt the user to enter the amount of water in kilograms and
 * the initial and final temperatures of the water. The formula to compute the
 * energy is:
 *
 * <pre>
 *
 * Q = M * (finalTemperature - initialTemperature) * 4184
 *
 * </pre>
 *
 * where M is the weight of water in kilograms, initial and final temperatures
 * are in degrees Celsius, and energy Q is measured in Joules.
 *
 * @Book Introduction to JAVA, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public final class Exercise_2_10 {

	/**
	 * Private constructor so this utility class cannot be instantiated.
	 */
	private Exercise_2_10() {

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
		System.out.println("Exercise 2.10 - Science: Calculating Energy");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt the user to enter the amount of water in kilograms.
		 */
		System.out.print("\nEnter the amount of water in kilograms: ");
		double M = consoleInput.nextDouble();

		/*
		 * Prompt the user to enter the initial temperature in Celsius.
		 */
		System.out.print("Enter the initial temperature: ");
		double initialTemperature = consoleInput.nextDouble();

		/*
		 * Prompt the user to enter the final temperature in Celsius.
		 */
		System.out.print("Enter the final temperature: ");
		double finalTemperature = consoleInput.nextDouble();

		/*
		 * Compute the energy needed to heat the water from initial temperature to final
		 * temperature.
		 */
		double Q = M * (finalTemperature - initialTemperature) * 4184;

		/*
		 * Output result to console.
		 */
		System.out.println("The energy needed is " + Q + " Joules.");

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
