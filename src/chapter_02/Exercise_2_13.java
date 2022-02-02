package chapter_02;

import java.util.Scanner;

/**
 * Exercise **2.13
 *
 * (Financial application: compound value) Suppose you save $100 each month into
 * a savings account with an annual interest rate 5%. Thus, the monthly interest
 * rate is 0.05/12 = 0.00417. After the first month, the value in the account
 * becomes
 *
 * <pre>
 *
 * 100 * (1 + 0.00417) = 100.417
 *
 * After the second month, the value in the account becomes
 *
 * (100 + 100.417) * ( 1 + 0.00417) = 201.252
 *
 * After the third month, the value in the account becomes
 *
 * (100 + 201.252) * (1 + 0.00417) = 302.507
 *
 * and so on.
 *
 * </pre>
 *
 * Write a program that prompts the user to enter a monthly saving amount and
 * displays the account value after the sixth month. (In Programming Exercise
 * 5.30, you will use the loop to simplify the code and display the account
 * value for any month.)
 *
 * @Book Introduction to JAVA, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public final class Exercise_2_13 {

	/**
	 * Private constructor so this utility class cannot be instantiated.
	 */
	private Exercise_2_13() {

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
		System.out.println("Exercise **2.13 - Financial Application: Compound Value");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt the user to enter the monthly saving amount.
		 */
		System.out.print("\nEnter the monthly saving amount: ");
		double monthlyInvestment = consoleInput.nextDouble();

		/*
		 * Compute account value for the sixth month.
		 */
		double interestRate = 5;
		double accountValue = 0;
		final double MONTHLY_RATE = interestRate / 100 / 12;

		accountValue = (monthlyInvestment + accountValue) * (1 + MONTHLY_RATE);
		accountValue = (monthlyInvestment + accountValue) * (1 + MONTHLY_RATE);
		accountValue = (monthlyInvestment + accountValue) * (1 + MONTHLY_RATE);
		accountValue = (monthlyInvestment + accountValue) * (1 + MONTHLY_RATE);
		accountValue = (monthlyInvestment + accountValue) * (1 + MONTHLY_RATE);
		accountValue = (monthlyInvestment + accountValue) * (1 + MONTHLY_RATE);

		/*
		 * Show accountValue to two decimal places.
		 */
		accountValue = (int) (accountValue * 100);
		accountValue = accountValue / 100;

		/*
		 * Output result to user.
		 */
		System.out.println("After the sixth month, the account value is $" + accountValue);

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
