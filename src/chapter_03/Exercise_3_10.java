package chapter_03;

import java.util.Scanner;

/**
 * Exercise 3.10
 *
 * (Game: addition quiz) Listing 3.3, SubtractionQuiz.java, randomly generates a
 * subtraction question. Revise the program to randomly generate an addition
 * question with two integers less than 100.
 *
 * @Book Introduction to JAVA, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public final class Exercise_3_10 {

	/**
	 * Private constructor so this utility class cannot be instantiated.
	 */
	private Exercise_3_10() {

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
		System.out.println("Exercise 3.10 - Game: Addition Quiz");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Generate random values to use for addition quiz.
		 */
		int valueOne = 10 + (int) (Math.random() * (100 - 10));
		int valueTwo = 10 + (int) (Math.random() * (100 - 10));

		/*
		 * Prompt user to enter the answer.
		 */
		System.out.print("\nWhat is " + valueOne + " + " + valueTwo + " = ");
		int answer = consoleInput.nextInt();

		/*
		 * Output the result to console.
		 */
		System.out.print("Your answer is");

		if (valueOne + valueTwo == answer) {

			System.out.println(" correct!");

		} else {

			System.out.println(" incorrect!");
			System.out.println("\nThe correct answer is " + (valueOne + valueTwo) + ".");

		}

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
