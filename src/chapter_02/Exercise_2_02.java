package chapter_02;

import java.util.Scanner;

/**
 * Exercise 2.2
 *
 * (Compute The Volume Of A Cylinder) Write a program that reads in the radius
 * and length of a cylinder and computes the area and volume using the following
 * formulas:
 *
 * <pre>
 *
 * Formula:
 *
 * area = radius * radius * pi
 * volume = area * length
 *
 * </pre>
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public final class Exercise_2_02 {

	/**
	 * Private constructor so this utility class cannot be instantiated.
	 */
	private Exercise_2_02() {

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
		System.out.println("Exercise 2.2: Compute The Volume Of A Cylinder");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt the user to enter the radius for a cylinder.
		 */
		System.out.print("\nEnter the radius of the cylinder: ");
		double radius = consoleInput.nextDouble();

		/*
		 * Prompt the user to enter the length for a cylinder.
		 */
		System.out.print("\nEnter the length of the cylinder: ");
		double length = consoleInput.nextDouble();

		/*
		 * Compute the area of the cylinder.
		 */
		double area = Math.pow(radius, 2) * Math.PI;

		/*
		 * Compute the volume of the cylinder.
		 */
		double volume = area * length;

		/*
		 * Output message to console.
		 */
		System.out.println("\nShape: Cylinder");
		System.out.println("Radius: " + radius);
		System.out.println("Length: " + length);
		System.out.println("Area: " + area);
		System.out.println("Volume: " + volume);

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
