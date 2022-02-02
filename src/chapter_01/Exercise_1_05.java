package chapter_01;

/**
 * Exercise 1.5
 *
 * (Compute Expressions) Write a program that displays the result of the
 * expression.
 *
 * <pre>
 *
 * 9.5 x 4.5 - 2.5 x 3
 * -------------------
 *      45.5 - 3.5
 * 
 * </pre>
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public final class Exercise_1_05 {

	/**
	 * Default constructor--private to prevent instantiation.
	 */
	private Exercise_1_05() {

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
		System.out.println("Exercise 1.5: Compute Expressions\n");

		/*
		 * Output message to console.
		 */
		System.out.println("9.5 x 4.5 - 2.5 x 3");
		System.out.println("------------------- = " + ((9.5 * 4.5 - 2.5 * 3) / (45.5 - 3.5)));
		System.out.println("   45.5 - 3.5");

		/*
		 * Close console output stream.
		 */
		System.out.close();
	}

}
