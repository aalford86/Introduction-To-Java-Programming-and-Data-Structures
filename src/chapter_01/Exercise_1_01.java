package chapter_01;

/**
 * Exercise 1.1
 *
 * (Display Three Messages) Write a program that displays "Welcome to Java",
 * "Welcome to Computer Science", and "Programming is fun".
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public final class Exercise_1_01 {

	/**
	 * Private constructor so this utility class cannot be instantiated.
	 */
	private Exercise_1_01() {
	}

	/**
	 * Main method.
	 *
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("Exercise 1.1: Display Three Messages");

		/*
		 * Print three messages to console.
		 */
		System.out.println("\nWelcome to Java");
		System.out.println("Welcome to Computer Science");
		System.out.println("Programming is fun");
	}

}
