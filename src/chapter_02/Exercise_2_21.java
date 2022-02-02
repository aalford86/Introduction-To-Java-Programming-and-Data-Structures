package chapter_02;

import java.util.Scanner;

/**
 * Exercise *2.21
 *
 * (Financial application: calculate future investment value) Write a program
 * that reads in investment amount, annual interest rate, and number of years
 * and displays the future investment value using the following formula:
 *
 * <pre>
 *
 * Formula:
 *
 * futureInvestmentValue = inverstmentAmount x (1 +
 * monthlyInterestRate)^numberOfYears * 12
 *
 * </pre>
 *
 * For example, if you enter the amount 1000, annual interest rate 3.25%, and
 * number of years 1, the future investment value is 1032.98.
 *
 * @Book Introduction to JAVA, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public final class Exercise_2_21 {

	/**
	 * Private constructor so this utility class cannot be instantiated.
	 */
	private Exercise_2_21() {

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
		System.out.println("Exercise *2.21 - Financial Application: Calculate Future Investment Value");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt the user for the initial investment value.
		 */
		System.out.print("\nEnter investment amount: ");
		double investmentAmount = consoleInput.nextDouble();

		/*
		 * Prompt the user for the annual interest rate.
		 */
		System.out.print("Enter annual interest rate in percentage: ");
		double annualInterestRate = consoleInput.nextDouble();

		/*
		 * Prompt the user for the number of years.
		 */
		System.out.print("Enter number of years: ");
		int numberOfYears = consoleInput.nextInt();

		/*
		 * Compute the futureInvestmentValue.
		 */
		double monthlyInterestRate = annualInterestRate / 1200;

		double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);

		/*
		 * Show futureInvestmentValue with 2 decimal places.
		 */
		futureInvestmentValue = (int) (futureInvestmentValue * 100);
		futureInvestmentValue /= 100;

		/*
		 * Output results to console.
		 */
		System.out.println("\nFuture value is " + futureInvestmentValue);

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
