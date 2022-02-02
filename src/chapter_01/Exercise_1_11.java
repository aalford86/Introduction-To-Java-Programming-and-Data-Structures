package chapter_01;

/**
 * Exercise *1.11
 *
 * (Population projection) The U.S. Census Bureau projects population based on
 * the following assumptions:
 *
 * <pre>
 * One birth every 7 seconds
 * One death every 13 seconds
 * One new immigrant every 45 seconds
 * </pre>
 *
 * Write a program to display the population for each of the next five years.
 * Assume that the current population is 312,032,486, and one year has 365 days.
 * Hint: In Java, if two integers perform division, the result is an integer.
 * The fractional part is truncated. For example, 5/4 is 1 (not 1.25) and 10/4
 * is 2 (not 2.5). To get an accurate result with the fractional part, one of
 * the values involved in the division must be a number with a decimal point.
 * For example, 5.0/4 is 1.25 and 10/4.0 is 2.5.
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public final class Exercise_1_11 {

	/**
	 * Default constructor--private to prevent instantiation.
	 */
	private Exercise_1_11() {

	}

	/**
	 * Main method.
	 *
	 * @param args the command line arguments; unused here
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("Exercise *1.11: Population Projection\n");

		/*
		 * Output message to console.
		 */
		System.out.println("Initial Population: 312,032,486\n");
		System.out.println("Year 1: " + (312_032_486
				+ 1 * ((60 * 60 * 24 * 365 / 7) - (60 * 60 * 24 * 365 / 13) + (60 * 60 * 24 * 365 / 45))));
		System.out.println("Year 2: " + (312_032_486
				+ 2 * ((60 * 60 * 24 * 365 / 7) - (60 * 60 * 24 * 365 / 13) + (60 * 60 * 24 * 365 / 45))));
		System.out.println("Year 3: " + (312_032_486
				+ 3 * ((60 * 60 * 24 * 365 / 7) - (60 * 60 * 24 * 365 / 13) + (60 * 60 * 24 * 365 / 45))));
		System.out.println("Year 4: " + (312_032_486
				+ 4 * ((60 * 60 * 24 * 365 / 7) - (60 * 60 * 24 * 365 / 13) + (60 * 60 * 24 * 365 / 45))));
		System.out.println("Year 5: " + (312_032_486
				+ 5 * ((60 * 60 * 24 * 365 / 7) - (60 * 60 * 24 * 365 / 13) + (60 * 60 * 24 * 365 / 45))));
	}

}
