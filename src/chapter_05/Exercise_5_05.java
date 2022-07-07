package chapter_05;

/**
 * Exercise 5.5
 *
 * (Conversion from kilograms to pounds and pounds to kilograms) Write a program
 * that displays the following two tables side by side:
 *
 * <pre>
 * Kilograms Pounds | Pounds Kilograms
 * 1         2.2    | 20     9.09
 * 3         6.6    | 25     11.36
 * . . .
 * 197       433.4  | 510    231.82
 * 199       437.8  | 515    234.09
 * </pre>
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date July 2022
 * @author Alex Alford
 *
 */
public class Exercise_5_05 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("\nExercise 5.5 - Conversion From Kilograms To Pounds And Pounds To Kilograms\n");

		/*
		 * Conversion Rates for pounds and kilometers.
		 */
		final double kiloToLb = 2.2;

		/*
		 * Number of loop iterations, lines in conversion table.
		 */
		final int count = 200;

		/*
		 * Conversion table header.
		 */
		System.out.println("Kilograms\tPounds\t\t|\tPounds\t\tKilograms");

		/*
		 * Print a table of conversions.
		 */
		for (int i = 1; i < count; i++) {

			int kilo = i;
			int lb = 15 + 5 * i;

			double pounds = kilo * kiloToLb;
			double kilograms = lb / kiloToLb;

			System.out.printf("%d\t\t%.2f\t\t|\t%d\t\t%.2f%n", kilo, pounds, lb, kilograms);

		}

	}

}
