package chapter_04;

/**
 * Exercise *4.25
 *
 * (Generate vehicle plate numbers) Assume that a vehicle plate number consists
 * of three uppercase letters followed by four digits. Write a program to
 * generate a plate number.
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public class Exercise_4_25 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("\nExercise *4.25 - Generate Vehicle Plate Numbers\n");

		/*
		 * Declare and initialize string to hold plate number.
		 */
		String plate = "";

		/*
		 * Set range of integers than will generate an uppercase letter character.
		 */
		int min = 65;
		int max = 90;

		/*
		 * Generate first uppercase letter.
		 */
		plate += (char) (int) (min + Math.random() * ((max - min) + 1));

		/*
		 * Generate second uppercase letter.
		 */
		plate += (char) (int) (min + Math.random() * ((max - min) + 1));

		/*
		 * Generate third uppercase letter.
		 */
		plate += (char) (int) (min + Math.random() * ((max - min) + 1));

		/*
		 * Set range of integers that will generate digit character.
		 */
		min = 48;
		max = 57;

		/*
		 * Generate first digit.
		 */
		plate += (char) (int) (min + Math.random() * ((max - min) + 1));

		/*
		 * Generate second digit.
		 */
		plate += (char) (int) (min + Math.random() * ((max - min) + 1));

		/*
		 * Generate third digit.
		 */
		plate += (char) (int) (min + Math.random() * ((max - min) + 1));

		/*
		 * Generate fourth digit.
		 */
		plate += (char) (int) (min + Math.random() * ((max - min) + 1));

		/*
		 * Display result to console.
		 */
		System.out.printf("%nThe plate number is %s.", plate);
	}

}
