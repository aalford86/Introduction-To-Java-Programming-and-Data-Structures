package chapter_01;

/**
 * Exercise 1.10
 *
 * (Average Speed In Miles) Assume that a runner runs 14 kilometers in 45 mins
 * and 30 seconds. Write a program that displays the average speed in miles per
 * hour. (Note 1 mile is equal to 1.6 kilometers.)
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public final class Exercise_1_10 {

	/**
	 * Default constructor--private to prevent instantiation.
	 */
	private Exercise_1_10() {

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
		System.out.println("Exercise 1.10: Average Speed In Miles\n");

		/*
		 * Output message to console.
		 */
		System.out.println("MPH: " + ((14 / 1.6) / ((45 * 60) + 30)) * (60 * 60));
	}

}
