package chapter_04;

import java.util.Scanner;

/**
 * Exercise *4.18 (Student major and status) Write a program that prompts the
 * user to enter two characters and displays the major and status represented in
 * the characters. The first character indicates the major and the second is a
 * number character 1, 2, 3, or 4, which indicates whether a student is a
 * freshman, sophomore, junior, or senior. Suppose that the following characters
 * are used to denote the majors:
 *
 * <pre>
 *
 * M: Mathematics
 * C: Computer Science
 * I: Information Technology
 *
 * Here are sample runs:
 *
 * Enter two characters: C3
 * Computer Science Junior
 *
 * Enter two characters: T3
 * Invalid input
 *
 * </pre>
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public class Exercise_4_18 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("\nExercise *4.18 - Student Major And Status\n");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt user to enter two characters.
		 */
		System.out.print("Enter two characters: ");
		String code = consoleInput.nextLine();

		/*
		 * If length of code is greater than 2 code entry is invalid.
		 */
		int length = code.length();

		if (length > 2) {
			System.out.println("Invalid input");
			System.exit(1);
		}

		/*
		 * Set major if found, otherwise display invalid input.
		 */
		String major = "";

		switch (code.charAt(0)) {
		case 'M':
			major = "Mathematics";
			break;
		case 'C':
			major = "Computer Science";
			break;
		case 'I':
			major = "Information Technology";
			break;
		default:
			System.out.println("Invalid input");
			System.exit(1);
		}

		/*
		 * Set class rank if found, otherwise display invalid input.
		 */
		String rank = "";

		switch (code.charAt(1)) {
		case '1':
			rank = "Freshman";
			break;
		case '2':
			rank = "Sophomore";
			break;
		case '3':
			rank = "Junior";
			break;
		case '4':
			rank = "Senior";
			break;
		default:
			System.out.println("Invalid input");
			System.exit(1);
		}

		/*
		 * Display result to console.
		 */
		System.out.printf("%n%s %s", major, rank);

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
