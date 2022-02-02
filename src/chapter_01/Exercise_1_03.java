package chapter_01;

/**
 * Exercise *1.3
 *
 * (Display a pattern) Write a program that displays the following pattern:
 * "JAVA".
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public final class Exercise_1_03 {

	/**
	 * Default constructor--private to prevent instantiation.
	 */
	private Exercise_1_03() {

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
		System.out.println("Exercise *1.3: Display a Pattern\n");

		/*
		 * Output "JAVA" pattern to console.
		 */
		System.out.println("   J    A   V     V   A   ");
		System.out.println("   J   A A   V   V   A A  ");
		System.out.println("J  J  AAAAA   V V   AAAAA ");
		System.out.println(" JJ  A     A   V   A     A");
	}

}
