package chapter_01;

/**
 * Exercise 1.6
 *
 * (Summation Of A Series) Write a program that displays the result of 1 + 2 + 3
 * + 4 + 5 + 6 + 7 + 8 + 9
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public final class Exercise_1_06 {

	/**
	 * Default constructor--private to prevent instantiation.
	 */
	private Exercise_1_06() {

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
		System.out.println("Exercise 1.6: Summation Of A Series\n");

		/*
		 * Output message to console.
		 */
		System.out.print("1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = ");
		System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9);

		/*
		 * Close console output stream.
		 */
		System.out.close();
	}

}
