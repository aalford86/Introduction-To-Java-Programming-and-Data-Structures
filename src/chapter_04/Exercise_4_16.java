package chapter_04;

/**
 * Exercise 4.16 (Random character) Write a program that displays a random
 * uppercase letter using the Math.random() method.
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public class Exercise_4_16 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("\nExercise 4.16 - Random Character\n");

		final int maxRange = 90;
		final int minRange = 65;

		/*
		 * Generate random value in range.
		 */
		char upperCaseLetter = (char) (int) (minRange + Math.random() * ((maxRange - minRange) + 1));

		/*
		 * Display result to console.
		 */
		System.out.printf("Randome Upper Case Letter : %c", upperCaseLetter);
	}

}
