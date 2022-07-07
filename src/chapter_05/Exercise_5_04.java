package chapter_05;

/**
 * Exercise 5.4
 *
 * (Conversion from miles to kilometers) Write a program that displays the
 * following table (note 1 mile is 1.609 kilometers):
 *
 * <pre>
 * Miles Kilometers
 *
 * 1     1.609
 * 2     3.218
 * . . .
 * 9     14.481
 * 10    16.090
 * </pre>
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date June 2022
 * @author Alex Alford
 *
 */
public class Exercise_5_04 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("\nExercise 5.4 - Conversion from Miles to Kilometers\n");

		/*
		 * Declare constants.
		 */
		final double conversionKilometers = 1.609;
		final int iterations = 10;

		/*
		 * Conversion table header.
		 */
		System.out.println("Miles\t\tKilometers");

		/*
		 * Compute and print lines in conversion table.
		 */
		for (int miles = 1; miles <= iterations; miles++) {

			/*
			 * Compute miles to kilometers.
			 */
			double kilometers = miles * conversionKilometers;

			/*
			 * Print line in conversion table.
			 */
			System.out.println(miles + "\t\t" + kilometers);
		}

	}

}
