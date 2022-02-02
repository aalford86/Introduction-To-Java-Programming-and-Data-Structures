package chapter_02;

/**
 * Exercise 2.18
 *
 * (Print A Table) Write a program that displays the following table. Cast
 * floating point numbers into integers.
 *
 * <pre>
 *
 * a    b   pow(a, b)
 * 1    2   1
 * 2    3   8
 * 3    4   81
 * 4    5   1024
 * 5    6   15625
 *
 * </pre>
 *
 * @Book Introduction to JAVA, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public final class Exercise_2_18 {

	/**
	 * Private constructor so this utility class cannot be instantiated.
	 */
	private Exercise_2_18() {

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
		System.out.println("Exercise 2.18 - Print A Table");

		/*
		 * Print a table of powers.
		 */
		System.out.println("\na\tb\tpow(a, b)");
		System.out.println("1\t2\t" + (int) Math.pow(1, 2));
		System.out.println("2\t3\t" + (int) Math.pow(2, 3));
		System.out.println("3\t4\t" + (int) Math.pow(3, 4));
		System.out.println("4\t5\t" + (int) Math.pow(4, 5));
		System.out.println("5\t6\t" + (int) Math.pow(5, 6));

	}

}
