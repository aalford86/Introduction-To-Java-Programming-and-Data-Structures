package chapter_04;

import java.util.Scanner;

/**
 * Exercise *4.14
 *
 * (Convert Letter Grade To Number) Write a program that prompts the user to
 * enter a letter grade A, B, C, D, or F and displays its corresponding numeric
 * value 4, 3, 2, 1, or 0. For other input, display invalid grade.
 *
 * <pre>
 *
 * Here is a sample run:
 *
 * Enter a letter grade: B
 * The numeric value for grade B is 3
 *
 * Enter a letter grade: T
 * T is an invalid grade
 *
 * </pre>
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public class Exercise_4_14 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("\nExercise *4.14 - Convert Letter Grade To Number\n");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt user to enter a letter grade A, B, C, D, or F.
		 */
		System.out.print("Enter a letter grade: ");
		String letter = consoleInput.nextLine();

		/*
		 * Match letter grade to appropriate numeric grade if no letter matches out
		 * invalid grade.
		 */
		int grade = 0;

		switch (letter) {
		case "A":
			grade = 4;
			break;
		case "B":
			grade = 3;
			break;
		case "C":
			grade = 2;
			break;
		case "D":
			grade = 1;
			break;
		case "F":
			break;
		default:
			System.out.printf("%s is an invalid grade.", letter);
			System.exit(1);
		}

		/*
		 * Display result to console.
		 */
		System.out.printf("The numeric value for %s is %d", letter, grade);

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
