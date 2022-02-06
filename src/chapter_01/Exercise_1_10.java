package chapter_01;

/**
 * Exercise 1.10
 *
 * (Average Speed In Miles) Assume that a runner runs 14 kilometers in 45 mins
 * and 30 seconds. Write a program that displays the average speed in miles per
 * hour. (Note 1 mile is equal to 1.6 kilometers.)
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public class Exercise_1_10 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("Exercise 1.10 - Average Speed In Miles");
		System.out.println("");

		/*
		 * Display result to console.
		 */
		System.out.print("MPH: ");
		System.out.println(((14 / 1.6) / ((45 * 60) + 30)) * (60 * 60));
	}

}
