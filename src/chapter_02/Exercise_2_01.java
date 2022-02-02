package chapter_02;

import java.util.Scanner;

/**
 * Exercise 2.1
 *
 * (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree
 * in a double value from the console, then converts it to Fahrenheit, and
 * displays the result. The formula for the conversion is a follows:
 *
 * <pre>
 *
 * Formula:
 *
 * fahrenheit = (9 / 5) * celsius + 32
 *
 * </pre>
 *
 * Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8.
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public final class Exercise_2_01 {

	/**
	 * Private constructor so this utility class cannot be instantiated.
	 */
	private Exercise_2_01() {

	}

	/**
	 * Main method.
	 *
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Program Title.
		 */
		System.out.println("Exercise 2.1: Convert Celsius to Fahrenheit\n");

		/*
		 * Prompt the user to input a Celsius value to be converted into Fahrenheit.
		 */
		System.out.print("Enter a Celsius value to convert to Fahrenheit: ");
		double celsius = consoleInput.nextDouble();

		/*
		 * Convert Celsius value to Fahrenheit.
		 */
		double fahrenheit = (9 / 5.0) * celsius + 32;

		/*
		 * Output message to console.
		 */
		System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
