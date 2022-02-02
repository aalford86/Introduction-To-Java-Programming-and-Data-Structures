package chapter_01;

/**
 * Exercise 1.9
 *
 * (Area and perimeter of a rectangle) Write a program that displays the area
 * and perimeter of a rectangle with a width of 4.5 and a height of 7.9 using
 * the following formula:
 *
 * <pre>
 *
 * area = width x height
 *
 * </pre>
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public final class Exercise_1_09 {

	/**
	 * Default constructor--private to prevent instantiation.
	 */
	private Exercise_1_09() {

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
		System.out.println("Exercise 1.9: Area and Perimeter of a Rectangle\n");

		/*
		 * Output message to console.
		 */
		System.out.println("Width: 4.5 \nHeight: 7.9");
		System.out.println("Perimeter = " + (2 * 4.5 + 2 * 7.9));
		System.out.println("Area = " + (4.5 * 7.9));
	}

}
