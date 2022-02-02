package chapter_03;

import java.util.Scanner;

/**
 * Exercise 3.14
 *
 * (Game: Heads Or Tails) Write a program that lets the user guess whether the
 * flip of a coin results in heads or tails. The program randomly generates an
 * integer 0 or 1, which represents head or tail. The program prompts the user
 * to enter a guess, and reports whether the guess is correct or incorrect.
 *
 * @Book Introduction to JAVA, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public final class Exercise_3_14 {

	/**
	 * Private constructor so this utility class cannot be instantiated.
	 */
	private Exercise_3_14() {

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
		System.out.println("Exercise 3.14 - Game: Heads Or Tails");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt user to enter a 0 for heads or 1 for tails.
		 */
		System.out.print("\nEnter a 0 for heads or 1 for tails: ");
		int userInput = consoleInput.nextInt();

		/*
		 * Generate a random integer 0 or 1.
		 */
		int coinFlip = (int) (Math.random() * (1 - 0 + 1) + 0);

		/*
		 * Display result to console.
		 */
		System.out.print(coinFlip == 0 ? "\nHeads " : "\nTails ");
		System.out.print("your guess is ");
		System.out.println(coinFlip == userInput ? "correct!" : "incorrect!");

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
