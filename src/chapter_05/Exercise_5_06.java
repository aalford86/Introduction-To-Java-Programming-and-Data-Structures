package chapter_05;

/**
 * Exercise 5.6
 *
 * (Conversion from miles to kilometers) Write a program that displays the
 * following two tables side by side:
 *
 * <pre>
 * Miles Kilometers | Kilometers Miles
 * 1     1.609      | 20         12.430
 * 2     3.218      | 25         15.538
 * . . .
 * 9     14.481     | 60         37.290
 * 10    16.090     | 65         40.398
 * </pre>
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date July 2022
 * @author Alex Alford
 *
 */
public class Exercise_5_06 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("\nExercise 5.6 - Conversion From Miles To Kilometers\n");

		/*
		 * Conversion rate mile to kilometer.
		 */
		final double mileToKilometer = 1.609;

		/*
		 * Number of loop iterations, lines in conversion table.
		 */
		final int count = 11;

		/*
		 * Conversion table header.
		 */
		System.out.println("Miles\tKilometers\t|\tKilometers\tMiles");

		/*
		 * Print a table of conversions.
		 */
		for (int i = 1; i < count; i++) {

			int miles = i;
			int kilometers = 15 + 5 * i;

			double toKilometers = miles * mileToKilometer;
			double toMiles = kilometers / mileToKilometer;

			System.out.printf("%d\t%.3f\t\t|\t%d\t\t%.3f%n", miles, toKilometers, kilometers, toMiles);

		}

	}

}
