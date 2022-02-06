package chapter_03;

import java.util.Scanner;

/**
 * Exercise *3.33
 *
 * (Financial: Compare Costs) Suppose you shop for rice in two different
 * packages. You would like to write a program to compare the cost. The program
 * prompts the user to enter the weight and price of each package and displays
 * the one with the better price.
 *
 * <pre>
 *
 * Here is a sample run:
 *
 * Enter weight and price for package 1: 50 24.59
 * Enter weight and price for package 2: 25 11.99
 * Package 2 has a better price.
 *
 * Enter weight and price for package 1: 50 25
 * Enter weight and price for package 2: 25 12.5
 * Two packages have the same price.
 *
 * </pre>
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public class Exercise_3_33 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("Exercise *3.33 - Financial: Compare Costs");
		System.out.println("");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt user to enter the weight and price for package 1.
		 */
		System.out.print("Enter weight and price for package 1: ");
		double weightPkg1 = consoleInput.nextDouble();
		double pricePkg1 = consoleInput.nextDouble();

		/*
		 * Prompt user to enter the weight and price for package 2.
		 */
		System.out.print("Enter weight and price for package 2: ");
		double weightPkg2 = consoleInput.nextDouble();
		double pricePkg2 = consoleInput.nextDouble();

		/*
		 * Compute the price per unit for each package.
		 */
		double pricePerUnitPkg1 = pricePkg1 / weightPkg1;
		double pricePerUnitPkg2 = pricePkg2 / weightPkg2;

		/*
		 * Display result to console.
		 */
		if (pricePerUnitPkg1 < pricePerUnitPkg2) {

			System.out.print("Package 1 has a better price.");

		} else if (pricePerUnitPkg1 > pricePerUnitPkg2) {

			System.out.print("Package 2 has a better price.");

		} else {

			System.out.print("Two packages have the same price.");

		}

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
