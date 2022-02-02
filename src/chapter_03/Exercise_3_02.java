package chapter_03;

import java.util.Scanner;

/**
 * Exercise 3.2
 *
 * (Game: Add Three Numbers) The program in Listing 3.1, AdditionQuiz.java,
 * generates two integers and prompts the user to enter the sum of these tow
 * integers. Revise the program to generate three single-digit integers and
 * prompt the user to enter the sum of three three integers.
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public final class Exercise_3_02 {

	/**
	 * Private constructor so this utility class cannot be instantiated.
	 */
	private Exercise_3_02() {

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
		System.out.println("Exercise 3.2 - Game: Add Three Numbers");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Generate addition values.
		 */
		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);
		int number3 = (int) (Math.random() * 10);

		/*
		 * Prompt user to enter the answer.
		 */
		System.out.print("\n" + number1 + " + " + number2 + " + " + number3 + " = ");
		int answer = consoleInput.nextInt();

		/*
		 * Output the results to console.
		 */
		int correctAnswer = number1 + number2 + number3;
		System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + (correctAnswer));
		System.out.print("\nYour answer is " + ((answer == correctAnswer) ? "correct." : "incorrect."));

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
