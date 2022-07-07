package chapter_05;

/**
 * Exercise **5.7
 *
 * (Financial application: compute future tuition) Suppose the tuition for a
 * university is $10,000 this year and increases 5% every year. In one year, the
 * tuition will be $10,500. Write a program that displays the tuition in 10
 * years, and the total cost of four years’ worth of tuition after the tenth
 * year.
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date July 2022
 * @author Alex Alford
 *
 */
public class Exercise_5_07 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("\nExercise **5.7 - Financial Application: Compute Future Tuition\n");

		/*
		 * Declare constants.
		 */
		final double initialTuition = 10000;
		final double increaseRate = 0.05;
		final int finalYear = 14;
		final int yearMark = 10;

		/*
		 * Declare variables.
		 */
		double tuition = initialTuition;

		/*
		 * Compute tuition up to the final year and print out the tuition at the year
		 * mark.
		 */
		for (int year = 1; year <= finalYear; year++) {

			/*
			 * Compute the tuition increase.
			 */
			tuition += tuition * increaseRate;

			/*
			 * Output the cost of tuition at the 10th year.
			 */
			if (year == yearMark) {

				System.out.printf("Tuition at year %d: $%.2f%n", yearMark, tuition);

			}

		}

		/*
		 * Output the cost of tuition for 4 years after the 10th year.
		 */
		System.out.printf("Cost of tuition 4 years after the %d year mark: $%.2f", yearMark, tuition);
	}

}
