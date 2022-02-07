package chapter_04;

import java.util.Scanner;

/**
 * Exercise *4.10
 *
 * (Guess Birthday) Rewrite Listing 4.3, GuessBirthday.java, to prompt the user
 * to enter the character Y for Yes and N for No, rather than entering 1 for Yes
 * and 0 for No.
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public class Exercise_4_10 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("\nExercise *4.10 - Guess Birthday\n");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Create each set of birthday dates.
		 */
		String set1 = " 1  3  5  7\n 9 11 13 15\n17 19 21 23\n25 27 29 31";
		String set2 = " 2  3  6  7\n10 11 14 15\n18 19 22 23\n26 27 30 31";
		String set3 = " 4  5  6  7\n12 13 14 15\n20 21 22 23\n28 29 30 31";
		String set4 = " 8  9 10 11\n12 13 14 15\n24 25 26 27\n28 29 30 31";
		String set5 = "16 17 18 19\n20 21 22 23\n24 25 26 27\n28 29 30 31";

		/*
		 * The birthday date.
		 */
		int day = 0;

		/*
		 * Prompt the user to answer questions.
		 */
		System.out.println("Is your birtday in Set 1?\n");
		System.out.println(set1);
		System.out.print("\nEnter N for No and Y for Yes: ");
		String userInput = consoleInput.nextLine();

		if (userInput.equalsIgnoreCase("Y")) {
			day += 1;
		}

		/*
		 * Prompt the user to answer questions.
		 */
		System.out.println("\nIs your birtday in Set 2?\n");
		System.out.println(set2);
		System.out.print("\nEnter N for No and Y for Yes: ");
		userInput = consoleInput.nextLine();

		if (userInput.equalsIgnoreCase("Y")) {
			day += 2;
		}

		/*
		 * Prompt the user to answer questions.
		 */
		System.out.println("\nIs your birtday in Set 3?\n");
		System.out.println(set3);
		System.out.print("\nEnter N for No and Y for Yes: ");
		userInput = consoleInput.nextLine();

		if (userInput.equalsIgnoreCase("Y")) {
			day += 4;
		}

		/*
		 * Prompt the user to answer questions.
		 */
		System.out.println("\nIs your birtday in Set 4?\n");
		System.out.println(set4);
		System.out.print("\nEnter N for No and Y for Yes: ");
		userInput = consoleInput.nextLine();

		if (userInput.equalsIgnoreCase("Y")) {
			day += 8;
		}

		/*
		 * Prompt the user to answer questions.
		 */
		System.out.println("\nIs your birtday in Set 5?\n");
		System.out.println(set5);
		System.out.print("\nEnter N for No and Y for Yes: ");
		userInput = consoleInput.nextLine();

		if (userInput.equalsIgnoreCase("Y")) {
			day += 16;
		}

		/*
		 * Display results to console.
		 */
		System.out.printf("%nYour birtday is %d!", day);

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
