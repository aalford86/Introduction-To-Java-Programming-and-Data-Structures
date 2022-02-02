package chapter_01;

/**
 * Exercise 1.7
 *
 * (Approximate pi) pi can be computed using the following formula:
 *
 * <pre>
 *                 1     1     1     1      1
 * pi = 4 x ( 1 - ___ + ___ - ___ + ___ - ____ + ... )
 *                 3     5     7     9     11
 * </pre>
 *
 * Write a program that displays the result of
 *
 * <pre>
 *                 1     1     1     1      1
 * pi = 4 x ( 1 - ___ + ___ - ___ + ___ - ____  )
 *                 3     5     7     9     11
 * </pre>
 *
 * and
 *
 * <pre>
 *                 1     1     1     1      1     1
 * pi = 4 x ( 1 - ___ + ___ - ___ + ___ - ____ + ____ )
 *                 3     5     7     9     11     13
 * </pre>
 *
 * Use 1.0 instead of 1 in your program.
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public final class Exercise_1_07 {

	/**
	 * Default constructor--private to prevent instantiation.
	 */
	private Exercise_1_07() {

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
		System.out.println("Exercise 1.7: Approximate Pi\n");

		/*
		 * Output message to console.
		 */
		System.out.println("                1     1     1     1      1");
		System.out.println("pi = 4 x ( 1 - ___ + ___ - ___ + ___ - ____  )");
		System.out.println("                3     5     7     9     11");
		System.out.print("pi = ");
		System.out.println(4 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11)));

		System.out.println("\n");

		System.out.println("                1     1     1     1      1       1");
		System.out.println("pi = 4 x ( 1 - ___ + ___ - ___ + ___ - ____  + ____)");
		System.out.println("                3     5     7     9     11      13");
		System.out.print("pi = ");
		System.out.println(4 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11) + (1.0 / 13)));
	}

}
