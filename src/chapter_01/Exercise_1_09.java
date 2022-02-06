package chapter_01;

/**
 * Exercise 1.9
 *
 * (Area And Perimeter Of A Rectangle) Write a program that displays the area
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
public class Exercise_1_09 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("Exercise 1.9 - Area And Perimeter Of A Rectangle");
		System.out.println("");

		/*
		 * Display result to console.
		 */
		System.out.println("Width: 4.5 \nHeight: 7.9");
		System.out.print("Perimeter = ");
		System.out.println(2 * 4.5 + 2 * 7.9);
		System.out.print("Area = ");
		System.out.println(4.5 * 7.9);
	}

}
