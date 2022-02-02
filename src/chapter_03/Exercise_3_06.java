package chapter_03;

import java.util.Scanner;

/**
 * Exercise *3.6
 *
 * (Health application: BMI) Revise Listing 3.4, ComputeAndInterpretBMI.java, to
 * let the user enter weight, feet, and inches. For example, if a person is 5
 * feet and 10 inches, you will enter 5 for feet and 10 for inches.
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public final class Exercise_3_06 {

	/**
	 * Private constructor so this utility class cannot be instantiated.
	 */
	private Exercise_3_06() {

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
		System.out.println("Exercise *3.6 - Health Application: BMI");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt the user to enter weight in pounds.
		 */
		System.out.print("\nEnter weight in pounds: ");
		double weight = consoleInput.nextDouble();

		/*
		 * Prompt the user to enter feet for height measurement.
		 */
		System.out.print("Enter feet: ");
		double feet = consoleInput.nextDouble();

		/*
		 * Prompt the user to enter inches for height measurement.
		 */
		System.out.print("Enter inches: ");
		double inches = consoleInput.nextDouble();

		/*
		 * Compute total height in inches.
		 */
		double height = (feet * 12) + inches;

		/*
		 * Constants used for conversions.
		 */
		final double KILOGRAMS_PER_POUND = 0.45359237;
		final double METERS_PER_INCH = 0.0254;

		/*
		 * Compute BMI.
		 */
		double weightInKilograms = weight * KILOGRAMS_PER_POUND;
		double heightInMeters = height * METERS_PER_INCH;
		double bmi = weightInKilograms / (heightInMeters * heightInMeters);

		/*
		 * Display result.
		 */
		System.out.println("\nBMI is " + bmi);

		if (bmi < 18.5) {

			System.out.println("Underweight");

		} else if (bmi < 25) {

			System.out.println("Normal");

		} else if (bmi < 30) {

			System.out.println("Overweight");

		} else {

			System.out.println("Obese");

		}

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
