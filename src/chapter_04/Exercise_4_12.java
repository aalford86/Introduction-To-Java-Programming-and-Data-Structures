package chapter_04;

import java.util.Scanner;

/**
 * Exercise 4.12
 *
 * (Hex to binary) Write a program that prompts the user to enter a hex digit
 * and displays its corresponding binary number. For an incorrect input, display
 * invalid input.
 *
 * <pre>
 *
 * Here is a sample run:
 *
 * Enter a hex digit: B
 * The binary value is 1011
 *
 * Enter a hex digit: G
 * G is an invalid input
 *
 * </pre>
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public class Exercise_4_12 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("\nExercise 4.12 - Hex To Binary\n");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt user to enter a hex digit.
		 */
		System.out.print("Enter a hex digit: ");
		String hexDigit = consoleInput.next();

		/*
		 * Binary value of a valid hex digit.
		 */
		int binaryValue = 0000;

		/*
		 * Set corresponding binary value for hex digit.
		 */
		switch (hexDigit) {
		case "0":
			binaryValue = 0000;
			break;
		case "1":
			binaryValue = 0001;
			break;
		case "2":
			binaryValue = 0010;
			break;
		case "3":
			binaryValue = 0011;
			break;
		case "4":
			binaryValue = 0100;
			break;
		case "5":
			binaryValue = 0101;
			break;
		case "6":
			binaryValue = 0110;
			break;
		case "7":
			binaryValue = 0111;
			break;
		case "8":
			binaryValue = 1000;
			break;
		case "9":
			binaryValue = 1001;
			break;
		case "A":
			binaryValue = 1010;
			break;
		case "B":
			binaryValue = 1011;
			break;
		case "C":
			binaryValue = 1100;
			break;
		case "D":
			binaryValue = 1101;
			break;
		case "E":
			binaryValue = 1110;
			break;
		case "F":
			binaryValue = 1111;
			break;
		default:
			System.out.printf("%s is an invalid input", hexDigit);
			System.exit(1);
		}

		/*
		 * Display result to console.
		 */
		System.out.printf("The hex value is %d", binaryValue);

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
