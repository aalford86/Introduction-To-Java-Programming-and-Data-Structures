package chapter_04;

import java.util.Scanner;

/**
 * Exercise *4.21
 *
 * (Check SSN) Write a program that prompts the user to enter a Social Security
 * number in the format DDD-DD-DDDD, where D is a digit. Your program should
 * check whether the input is valid.
 *
 * <pre>
 *
 * Here are sample runs:
 *
 * Enter a SSN: 232−23−5435
 * 232−23−5435 is a valid social security number
 *
 * Enter a SSN: 23−23−5435
 * 23−23−5435 is an invalid social security number
 *
 * </pre>
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public class Exercise_4_21 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("\nExercise *4.21 - Check SSN\n");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt user to enter a valid SSN ###-##-####.
		 */
		System.out.print("Enter a SSN: ");
		String ssn = consoleInput.nextLine();

		/*
		 * Validate SSN entry.
		 */
		final int ssnLength = 11;
		boolean isValid = true;

		/*
		 * Check if the length is correct. Check if the hyphen is at position 3 and 6.
		 * Check if remaining characters are digits.
		 */
		if (ssn.length() != ssnLength) {

			isValid = false;

		} else if (ssn.charAt(3) != '-' || ssn.charAt(6) != '-') {

			isValid = false;

		} else if (Character.isDigit(ssn.charAt(0))) {

			isValid = false;

		} else if (Character.isDigit(ssn.charAt(1))) {

			isValid = false;

		} else if (Character.isDigit(ssn.charAt(2))) {

			isValid = false;

		} else if (Character.isDigit(ssn.charAt(4))) {

			isValid = false;

		} else if (Character.isDigit(ssn.charAt(5))) {

			isValid = false;

		} else if (Character.isDigit(ssn.charAt(7))) {

			isValid = false;

		} else if (Character.isDigit(ssn.charAt(8))) {

			isValid = false;

		} else if (Character.isDigit(ssn.charAt(9))) {

			isValid = false;

		} else if (Character.isDigit(ssn.charAt(10))) {

			isValid = false;

		}

		/*
		 * Set valid/invalid message.
		 */
		String valid = isValid ? "a valid" : "an invalid";

		/*
		 * Display result to console.
		 */
		System.out.printf("%n%s is %s social security number", ssn, valid);

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
