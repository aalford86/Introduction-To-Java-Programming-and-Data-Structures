package chapter_04;

import java.util.Scanner;

/**
 * Exercise *4.2
 *
 * (Geometry: Great Circle Distance) The great circle distance is the distance
 * between two points on the surface of a sphere. Let (x1, y1) and (x2, y2) be
 * the geographical latitude and longitude of two points. The great circle
 * distance between the two points can be computed using the following formula:
 *
 * <pre>
 *
 * d = radius x arccos(sin(x1) x sin(x2) + cos(x1) X cos(x2) x cos(y1 - y2))
 *
 * </pre>
 *
 * Write a program that prompts the user to enter the latitude and longitude of
 * two points on the earth in degrees and displays its great circle distance.
 * The average radius of the earth is 6,371.01 km. Note you need to convert the
 * degrees into radians using the Math.toRadians method since the Java
 * trigonometric methods use radians. The latitude and longitude degrees in the
 * formula are for north and west. Use negative to indicate south and east
 * degrees.
 *
 * <pre>
 *
 * Here is a sample run:
 *
 * Enter point 1 (latitude and longitude) in degrees: 39.55 −116.25
 * Enter point 2 (latitude and longitude) in degrees: 41.5 87.37
 * The distance between the two points is 10691.79183231593 km
 *
 * </pre>
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public class Exercise_4_02 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("\nExercise *4.2 - Gemometry: Great Circle Distance \n");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt the user to enter the latitude (x1) and longitude (y1) for the first
		 * point.
		 */
		System.out.print("Enter point 1 (latitude and logitude) in degrees: ");
		double x1 = Math.toRadians(consoleInput.nextDouble());
		double y1 = Math.toRadians(consoleInput.nextDouble());

		/*
		 * Prompt the user to enter the latitude (x2) and longitude (y2) for the second
		 * point.
		 */
		System.out.print("Enter point 2 (latitude and logitude) in degrees: ");
		double x2 = Math.toRadians(consoleInput.nextDouble());
		double y2 = Math.toRadians(consoleInput.nextDouble());

		/*
		 * Compute the distance between the two points on a sphere.
		 */
		final double RADIUS = 6371.01;

		double distance = RADIUS
				* Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

		/*
		 * Display result to console.
		 */
		System.out.printf("The distance between the two points is %,f km", distance);

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
