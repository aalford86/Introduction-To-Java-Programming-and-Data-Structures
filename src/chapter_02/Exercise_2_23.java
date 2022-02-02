package chapter_02;

import java.util.Scanner;

/**
 * Exercise *2.3
 *
 * (Cost Of Driving) Write a program that prompts the user to enter the distance
 * to drive, the fuel efficiency of the car in miles per gallon, and the price
 * per gallon then displays the cost of the trip.
 *
 * @Book Introduction to JAVA, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public final class Exercise_2_23 {

	/**
	 * Private constructor so this utility class cannot be instantiated.
	 */
	private Exercise_2_23() {

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
		System.out.println("Exercise *2.23 - Cost Of Driving");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt user to enter driving distance.
		 */
		System.out.print("\nEnter the driving distance: ");
		double distance = consoleInput.nextDouble();

		/*
		 * Prompt user to enter miles per gallon.
		 */
		System.out.print("Enter miles per gallon: ");
		double milesPerGallon = consoleInput.nextDouble();

		/*
		 * Prompt user to enter price per gallon.
		 */
		System.out.print("Enter price per gallon: ");
		double pricePerGallon = consoleInput.nextDouble();

		/*
		 * Compute the cost of driving.
		 */
		double costOfDriving = distance / milesPerGallon * pricePerGallon;

		/*
		 * Show costOfDriving with 2 decimal places.
		 */
		costOfDriving = (int) (costOfDriving * 100);
		costOfDriving /= 100;

		/*
		 * Output results to console.
		 */
		System.out.println("\nThe cost of driving is $" + costOfDriving);

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
