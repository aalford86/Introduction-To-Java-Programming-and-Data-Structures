package chapter_04;

import java.util.Scanner;

/**
 * Exercise *4.11
 *
 * (Decimal to hex) Write a program that prompts the user to enter an integer
 * between 0 and 15 and displays its corresponding hex number. For an incorrect
 * input number, display invalid input.
 *
 * <pre>
 *
 * Here are some sample runs:
 *
 * Enter a decimal value (0 to 15): 11
 * The hex value is B
 *
 * Enter a decimal value (0 - 15): 5
 * The hex value is 5
 *
 * Enter a decimal value (0 - 15): 31
 * 31 is an invalid input
 *
 * </pre>
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public class Exercise_4_11 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("\nExercise *4.11 - Decimal To Hex\n");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt user to enter a decimal value between 0 and 15.
		 */
		System.out.print("Enter a decimal value (0 - 15): ");
		int decimal = consoleInput.nextInt();

		char hexValue = '0';

		/*
		 * Set the correct hex value for corresponding decimal (0 - 15).
		 */
		switch (decimal) {
		case 0:
			hexValue = '0';
			break;
		case 1:
			hexValue = '1';
			break;
		case 2:
			hexValue = '2';
			break;
		case 3:
			hexValue = '3';
			break;
		case 4:
			hexValue = '4';
			break;
		case 5:
			hexValue = '5';
			break;
		case 6:
			hexValue = '6';
			break;
		case 7:
			hexValue = '7';
			break;
		case 8:
			hexValue = '8';
			break;
		case 9:
			hexValue = '9';
			break;
		case 10:
			hexValue = 'A';
			break;
		case 11:
			hexValue = 'B';
			break;
		case 12:
			hexValue = 'C';
			break;
		case 13:
			hexValue = 'D';
			break;
		case 14:
			hexValue = 'E';
			break;
		case 15:
			hexValue = 'F';
			break;
		default:
			System.out.printf("%d is an invalid input", decimal);
			System.exit(1);
		}

		/*
		 * Display result to console.
		 */
		System.out.printf("The hex value is %c", hexValue);

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
