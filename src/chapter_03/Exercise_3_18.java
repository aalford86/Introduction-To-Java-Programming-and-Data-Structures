package chapter_03;

import java.util.Scanner;

/**
 * Exercise *3.18
 *
 * (Cost Of Shipping) A shipping company uses the following function to
 * calculate the cost (in dollars) of shipping based on the weight of the
 * package (in pounds).
 *
 * <pre>
 *
 *        { 3.5, if 0 < w <= 1
 * c(w) = { 5.5, if 1 < w <= 3
 *        { 8.5, if 3 < w <= 10
 *        { 10.5, if 10 < w <= 20
 *
 * </pre>
 *
 * Write a program that prompts the user to enter the weight of the package and
 * displays the shipping cost. If the weight is negative or zero, display a
 * message "Invalid input." If the weight is greater than 20, display a message
 * "The package cannot be shipped."
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public final class Exercise_3_18 {

	/**
	 * Private constructor so this utility class cannot be instantiated.
	 */
	private Exercise_3_18() {

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
		System.out.println("Exercise *3.18 - Cost Of Shipping");
		System.out.println("");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt the user to enter weight of shippment.
		 */
		System.out.print("Enter the weight in pounds for the package: ");
		double packageWeight = consoleInput.nextDouble();

		/*
		 * Determine if package can be shipped is so what is the shipping cost.
		 */
		String shipping = "";

		if (packageWeight <= 0) {
			shipping = "Invalid Input!";
		} else if (packageWeight <= 1) {
			shipping = "Shipping Cost: $3.50";
		} else if (packageWeight <= 3) {
			shipping = "Shipping Cost: $5.50";
		} else if (packageWeight <= 10) {
			shipping = "Shipping Cost: $8.50";
		} else if (packageWeight <= 20) {
			shipping = "Shipping Cost: $10.50";
		} else {
			shipping = "The package cannot be shipped.";
		}

		/*
		 * Display result to console.
		 */
		System.out.print(shipping);

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
