package chapter_01;

/**
 * Exercise 1.4
 *
 * (Print A Table) Write a program that displays the following table.
 *
 * <pre>
 * a   a^2  a^3
 * 1   1    1
 * 2   4    8
 * 3   9    27
 * 4   16   64
 * </pre>
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public final class Exercise_1_04 {

	/**
	 * Default constructor--private to prevent instantiation.
	 */
	private Exercise_1_04() {

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
		System.out.println("Exercise 1.4: Print A Table\n");

		/*
		 * Output message to console.
		 */
		System.out.println("a\ta^2\ta^3");
		System.out.println(Math.pow(1, 1) + "\t" + Math.pow(1, 2) + "\t" + Math.pow(1, 3));
		System.out.println(Math.pow(2, 1) + "\t" + Math.pow(2, 2) + "\t" + Math.pow(2, 3));
		System.out.println(Math.pow(3, 1) + "\t" + Math.pow(3, 2) + "\t" + Math.pow(3, 3));
		System.out.println(Math.pow(4, 1) + "\t" + Math.pow(4, 2) + "\t" + Math.pow(4, 3));
	}

}
