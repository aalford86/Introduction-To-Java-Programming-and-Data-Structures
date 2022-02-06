package chapter_01;

/**
 * Exercise *1.13
 *
 * (Algebra: Solve 2 X 2 linear equations) You can use Cramer's rule to solve
 * the following 2 X 2 system of linear equation provided that ad - bc is not 0:
 *
 * <pre>
 *
 * Formula
 *
 * ax + by = e       ed - bf         af - ec
 *              x = ---------   y = ---------
 * cx + dy = f       ad - bc         ad - bc
 *
 * </pre>
 *
 * Write a program that solves the following equation and displays the value of
 * x and y: (Hint: Replace the symbols in the formul with numbers to compute x
 * and y. This exercise can be done in Chapter 1 without using materials in
 * later chapters.)
 *
 * <pre>
 *
 * 3.4x + 50.2y = 44.5
 * 2.1x + 0.55y = 5.9
 * </pre>
 *
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public class Exercise_1_13 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("Exercise *1.13 - Algebra: Solve 2x2 Linear Equations");
		System.out.println("");

		/*
		 * Display result to console.
		 */
		System.out.print("x = ");
		System.out.println(((44.5 * 0.55 - 50.2 * 5.9) / (3.4 * 0.55 - 50.2 * 2.1)));

		System.out.print("y = ");
		System.out.println(((3.4 * 5.9 - 44.5 * 2.1) / (3.4 * 0.55 - 50.2 * 2.1)));
	}

}
