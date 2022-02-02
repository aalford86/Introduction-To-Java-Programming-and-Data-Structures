package chapter_02;

import java.util.Scanner;

/**
 * Exercise *2.14
 *
 * (Health application: computing BMI) Body Mass Index (BMI) is a measure of
 * health on weight. It can be calculated by taking your weight in kilograms and
 * dividing by the square of your height in meters. Write a program that prompts
 * the user to enter a weight in pounds and height in inches and displays the
 * BMI Note one pound is 0.45359237 kilograms and one inch is 0.0254 meters.
 *
 * @Book Introduction to JAVA, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public final class Exercise_2_14 {

	/**
	 * Private constructor so this utility class cannot be instantiated.
	 */
	private Exercise_2_14() {

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
		System.out.println("Exercise 2.14 - Health Application: Computing BMI");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt the user to enter the weight in pounds.
		 */
		System.out.print("\nEnter weight in pounds: ");
		float pounds = consoleInput.nextFloat();

		/*
		 * Prompt the user to enter the height in inches.
		 */
		System.out.print("Enter height in inches: ");
		float inches = consoleInput.nextFloat();

		/*
		 * Convert pounds and inches into kilograms and meters.
		 */
		final double POUND_PER_KILOGRAM = 0.45359237;
		final double INCH_PER_METER = 0.0254;

		float kilograms = (float) (pounds * POUND_PER_KILOGRAM);
		float meters = (float) (inches * INCH_PER_METER);

		/*
		 * Compute the body mass index (BMI).
		 */
		float bmi = (float) (kilograms / (Math.pow(meters, 2)));

		/*
		 * Output result to console.
		 */
		System.out.println("BMI is " + bmi);

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
