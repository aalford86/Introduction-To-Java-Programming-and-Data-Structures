package chapter_03;

import java.util.Scanner;

/**
 * Exercise **3.15
 *
 * (Game: Lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of
 * three-digit integer. The program prompts the user to enter a three-digit
 * integer and determines whether the user wins according to the following
 * rules.
 *
 * 1. If the user input matches the lottery number in the exact order, the award
 * is $10,000.
 *
 * 2. If all digits in the user input match all digits in the lottery number,
 * the award is $3,000.
 *
 * 3. If one digit in the user input matches a digit in the lottery number, the
 * award is $1,000.
 *
 * @Book Introduction to JAVA, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public final class Exercise_3_15 {

	/**
	 * Private constructor so this utility class cannot be instantiated.
	 */
	private Exercise_3_15() {

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
		System.out.println("Exercise **3.15 - Game: Lottery");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt the user to enter a guess.
		 */
		System.out.print("\nEnter your lottery pick (three digits): ");
		int guess = consoleInput.nextInt();

		/*
		 * Get individual digits from guess.
		 */
		int guessDigit1 = guess / 100;
		int guessDigit2 = guess / 10 % 10;
		int guessDigit3 = guess % 10;

		/*
		 * Generate a three digit lottery number.
		 */
		int lottery = (int) (Math.random() * (1000 - 100 + 1) + 100);

		/*
		 * Get individual digits from lottery.
		 */
		int lotteryDigit1 = lottery / 100;
		int lotteryDigit2 = lottery / 10 % 10;
		int lotteryDigit3 = lottery % 10;

		System.out.println("\nLottery Number: " + lottery);

		/*
		 * Check the guess.
		 */
		if (guess == lottery) {

			System.out.println("\nExact Match: You win $10,000.");

		} else if ((guessDigit1 == lotteryDigit1) && (guessDigit2 == lotteryDigit3) && (guessDigit3 == lotteryDigit2)
				|| (guessDigit1 == lotteryDigit2) && (guessDigit2 == lotteryDigit1) && (guessDigit3 == lotteryDigit3)
				|| (guessDigit1 == lotteryDigit2) && (guessDigit2 == lotteryDigit3) && (guessDigit3 == lotteryDigit1)
				|| (guessDigit1 == lotteryDigit3) && (guessDigit2 == lotteryDigit1) && (guessDigit3 == lotteryDigit2)
				|| (guessDigit1 == lotteryDigit3) && (guessDigit2 == lotteryDigit2) && (guessDigit3 == lotteryDigit1)) {

			System.out.println("\nMatch all digits: you win $3,000.");

		} else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3
				|| guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit3 == lotteryDigit3
				|| guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3) {

			System.out.println("\nMatch one digit: you win $1,000.");

		} else {

			System.out.println("\nSorry, no match.");

		}

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
