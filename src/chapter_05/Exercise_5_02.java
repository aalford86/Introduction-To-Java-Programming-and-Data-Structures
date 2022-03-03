package chapter_05;

import java.util.Scanner;

/**
 * Exercise 5.2 (Repeat additions) Listing 5.4, SubtractionQuizLoop.java,
 * generates five random subtraction questions. Revise the program to generate
 * 10 random addition questions for two integers between 1 and 15. Display the
 * correct count and test time.
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date March 2022
 * @author Alex Alford
 *
 */
public class Exercise_5_02 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("\nExercise 5.2 - Repeat Additions\n");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		final int NUMBER_OF_QUESTIONS = 10;
		int correctCount = 0;
		int count = 0;
		long startTime = System.currentTimeMillis();
		String output = " ";

		while (count < NUMBER_OF_QUESTIONS) {

			// 1. Generate two random single-digit integers.
			int number1 = (int) (Math.random() * 15 + 1);
			int number2 = (int) (Math.random() * 15 + 1);

			// 2. Prompt the student to answer "What is number1 + number2?"
			System.out.print("What is " + number1 + " + " + number2 + "? ");
			int answer = consoleInput.nextInt();

			// 3. Grade the answer and display the result.
			if (number1 + number2 == answer) {
				System.out.println("You are correct!\n");
				correctCount++;
			} else {
				System.out.println("Your answer is wrong!");
				System.out.print(number1 + " + " + number2 + " should be ");
				System.out.println(number1 + number2 + "\n");
			}

			// 4. Increment question count.
			count++;

			output += "\n" + number1 + " + " + number2 + " = " + answer
					+ ((number1 + number2 == answer ? " correct" : " wrong"));

		}

		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;

		System.out.println("Correct count is " + correctCount);
		System.out.println("Test time is " + testTime / 1000 + " seconds");
		System.out.println(output);

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
