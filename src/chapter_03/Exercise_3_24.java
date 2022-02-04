package chapter_03;

/**
 * Exercise **3.24
 *
 * (Game: Pick A Card) Write a program that simulates picking a card from a deck
 * of 52 cards. Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8,
 * 9, 10, Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of the
 * card.
 *
 * <pre>
 *
 * Here is a sample run of the program:
 *
 * The card you picked is Jack of Hearts
 *
 * </pre>
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public class Exercise_3_24 {

	/**
	 * Main method.
	 *
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {

		/*
		 * Program Title.
		 */
		System.out.println("Exercise **3.24 - Game: Pick A Card");
		System.out.println("");

		/*
		 * Generate rank.
		 */
		final int MAX_RANK = 13;
		final int MIN_RANK = 1;
		int rank = (int) (Math.random() * ((MAX_RANK - MIN_RANK) + 1) + MIN_RANK);

		/*
		 * Set rank for console message.
		 */
		String rankStr = "";

		switch (rank) {
		case 1:
			rankStr = "Ace";
			break;
		case 11:
			rankStr = "Jack";
			break;
		case 12:
			rankStr = "Queen";
			break;
		case 13:
			rankStr = "King";
			break;
		default:
			rankStr = "" + rank;
		}

		/*
		 * Generate suit.
		 */
		final int MAX_SUIT = 4;
		final int MIN_SUIT = 1;
		int suit = (int) (Math.random() * ((MAX_SUIT - MIN_SUIT) + 1) + MIN_SUIT);

		/*
		 * Set suit for console message.
		 */
		String suitStr = "";

		switch (suit) {
		case 1:
			suitStr = "Clubs";
			break;
		case 2:
			suitStr = "Diamonds";
			break;
		case 3:
			suitStr = "Hearts";
			break;
		case 4:
			suitStr = "Spades";
			break;
		default:
			System.out.println("No suit found.");
			System.out.println("Terminate Program...");
			System.exit(1);
		}

		/*
		 * Display result to console.
		 */
		System.out.println("The card you picked is " + rankStr + " of " + suitStr + ".");
	}

}
