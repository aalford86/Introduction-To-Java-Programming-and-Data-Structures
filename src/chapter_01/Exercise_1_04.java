package chapter_01;

/**
 * Exercise 1.4
 *
 * (Print A Table) Write a program that displays the following table:
 *
 * <pre>
 *
 * a   a^2  a^3
 * 1   1    1
 * 2   4    8
 * 3   9    27
 * 4   16   64
 *
 * </pre>
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public final class Exercise_1_04 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments; unused here
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("Exercise 1.4 - Print A Table");
		System.out.println("");

		/*
		 * Display result to console.
		 */

		/*
		 * Print row with column labels.
		 */
		System.out.println("a       a^2     a^3");

		/*
		 * Print row with 1 to the power of 2 and 3.
		 */
		System.out.print(1.0);
		System.out.print("     ");
		System.out.print(1.0 * 1.0);
		System.out.print("     ");
		System.out.println(1.0 * 1.0 * 1.0);

		/*
		 * Print row with 2 to the power of 2 and 3.
		 */
		System.out.print(2.0);
		System.out.print("     ");
		System.out.print(2.0 * 2.0);
		System.out.print("     ");
		System.out.println(2.0 * 2.0 * 2.0);

		/*
		 * Print row with 3 to the power of 2 and 3.
		 */
		System.out.print(3.0);
		System.out.print("     ");
		System.out.print(3.0 * 3.0);
		System.out.print("     ");
		System.out.println(3.0 * 3.0 * 3.0);

		/*
		 * Print row with 4 to the power of 2 and 3.
		 */
		System.out.print(4.0);
		System.out.print("     ");
		System.out.print(4.0 * 4.0);
		System.out.print("    ");
		System.out.println(4.0 * 4.0 * 4.0);
	}

}
