package chapter_01;

/**
 * Exercise 1.12
 *
 * (Average Speed In Kilometers) Assume that a runner runs 24 miles in 1 hour,
 * 40 minutes, and 35 seconds. Write a program that displays the average speed
 * in kilometers per hour. (Note: 1 mile is equal to 1.6 kilometers.)
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public final class Exercise_1_12 {

	/**
	 * Default constructor--private to prevent instantiation.
	 */
	private Exercise_1_12() {

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
		System.out.println("Exercise 1.12: Average Speed In Kilometers\n");

		/*
		 * Output message to console.
		 */
		System.out.println("24 miles in 1 hour, 40 minutes, and 35 seconds will be "
				+ ((24 * 1.6) / (100 * 60 + 45)) * 60 * 60 + " kilometers per hour.");
	}

}
