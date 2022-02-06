package chapter_01;

/**
 * Exercise 1.8
 *
 * (Area And Perimeter Of A Circle) Write a program that displays the area and
 * perimeter of a circle that has a radius of 5.5 using the following formulas:
 *
 * <pre>
 *
 * perimeter = 2 x radius x pi
 * area = radius x radius x pi
 *
 * </pre>
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public class Exercise_1_08 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments; unused here
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("Exercise 1.8 - Area And Perimeter Of A Circle");
		System.out.println("");

		/*
		 * Display result to console.
		 */
		System.out.println("Radius = 5.5");

		System.out.print("Perimeter = ");
		System.out.println(2 * 5.5 * 3.14);

		System.out.print("Area = ");
		System.out.println(5.5 * 5.5 * 3.14);
	}

}
