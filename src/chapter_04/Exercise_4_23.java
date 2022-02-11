package chapter_04;

import java.util.Scanner;

/**
 * Exercise *4.23
 *
 * (Financial application: payroll) Write a program that reads the following
 * information and prints a payroll statement:
 *
 * <pre>
 *
 * Employee’s name (e.g., Smith)
 * Number of hours worked in a week (e.g., 10)
 * Hourly pay rate (e.g., 9.75)
 * Federal tax withholding rate (e.g., 20%)
 * State tax withholding rate (e.g., 9%)
 *
 * A sample run is as follows:
 *
 * Enter employee’s name: Smith
 * Enter number of hours worked in a week: 10
 * Enter hourly pay rate: 9.75
 * Enter federal tax withholding rate: 0.20
 * Enter state tax withholding rate: 0.09
 *
 * Employee Name: Smith
 * Hours Worked: 10.0
 * Pay Rate: $9.75
 * Gross Pay: $97.5
 * Deductions:
 * 	Federal Withholding (20.0%): $19.5
 * 	State Withholding (9.0%): $8.77
 * 	Total Deduction: $28.27
 * Net Pay: $69.22
 *
 * </pre>
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public class Exercise_4_23 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("\nExercise *4.23 - Financial Application: Payroll\n");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt user to enter employee's name.
		 */
		System.out.print("Enter employee's name: ");
		String name = consoleInput.nextLine();

		/*
		 * Prompt user to enter hours worked.
		 */
		System.out.print("Enter number of hours worked in a week: ");
		double hours = consoleInput.nextDouble();

		/*
		 * Prompt user to enter hourly pay rate.
		 */
		System.out.print("Enter hourly pay rate: ");
		double payRate = consoleInput.nextDouble();

		/*
		 * Prompt user to enter federal tax rate.
		 */
		System.out.print("Enter federal tax withholding rate: ");
		double federalRate = consoleInput.nextDouble();

		/*
		 * Prompt user to enter state tax rate.
		 */
		System.out.print("Enter state tax withholding rate: ");
		double stateRate = consoleInput.nextDouble();

		/*
		 * Compute gross pay.
		 */
		double grossPay = hours * payRate;

		/*
		 * Compute federal withholding.
		 */
		double federalTax = grossPay * federalRate;

		/*
		 * Compute federal percentage.
		 */
		federalRate *= 100;

		/*
		 * Compute state withholding.
		 */
		double stateTax = grossPay * stateRate;

		/*
		 * Compute state percentage.
		 */
		stateRate *= 100;

		/*
		 * Compute deductions.
		 */
		double totalDeduction = federalTax + stateTax;

		/*
		 * Compute net pay.
		 */
		double netPay = grossPay - totalDeduction;

		/*
		 * Display result to console.
		 */
		System.out.printf("%nEmployee Name: %s", name);
		System.out.printf("%nHours Worked: %,.1f", hours);
		System.out.printf("%nPay Rate: $%,.2f", payRate);
		System.out.printf("%nGross Pay: $%,.2f", grossPay);
		System.out.print("\nDeductions:");
		System.out.printf("%n\tFederal Withholding (%.1f%%): $%,.2f", federalRate, federalTax);
		System.out.printf("%n\tState Withholding (%.1f%%): $%,.2f", stateRate, stateTax);
		System.out.printf("%n\tTotal Deduction: $%,.2f", totalDeduction);
		System.out.printf("%nNet Pay: $%,.2f", netPay);

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
