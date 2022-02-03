package chapter_03;

import java.util.Scanner;

/**
 * Exercise *3.17
 *
 * (Game: Scissor, Rock, Paper) Write a program that plays the popular
 * scissor-rock-paper game. (A scissor can cut a paper, a rock can knock a
 * scissor, and a paper can wrap a rock.) The program randomly generates a
 * number 0, 1, or 2 and displays a message indicating whether the user or the
 * computer wins, loses, or draws.
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 *
 */
public final class Exercise_3_17 {

	/**
	 * Private constructor so this utility class cannot be instantiated.
	 */
	private Exercise_3_17() {

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
		System.out.println("Exercise *3.17 - Game: Scissor, Rock, Paper");
		System.out.println("");

		/*
		 * Open input stream.
		 */
		Scanner consoleInput = new Scanner(System.in);

		/*
		 * Prompt user to enter their choice of scissor, rock, or paper.
		 */
		System.out.println("0 - Scissor");
		System.out.println("1 - Rock");
		System.out.println("2 - Paper");
		System.out.print("Enter your selection to play: ");
		int userInput = consoleInput.nextInt();

		/*
		 * Generate random computer selection of scissor, rock, or paper.
		 */
		int NPC = (int) (Math.random() * 3);

		/*
		 * Set the NPC choice for output message.
		 */
		String isNPC = "";

		switch (NPC) {
		case 0:
			isNPC = "scissor";
			break;
		case 1:
			isNPC = "rock";
			break;
		case 2:
			isNPC = "paper";
			break;
		default:
			System.out.println("Invalid: No NPC selection found!");
			System.out.println("Terminate Program...");
			System.exit(1);
		}

		/*
		 * Set the user choice for output message.
		 */
		String isUser = "";

		switch (userInput) {
		case 0:
			isUser = "scissor";
			break;
		case 1:
			isUser = "rock";
			break;
		case 2:
			isUser = "paper";
			break;
		default:
			System.out.println("Invalid: No user selection found!");
			System.out.println("Terminate Program...");
			System.exit(1);
		}

		/*
		 * Determine winner and set output message.
		 */
		String winner = "";

		switch (userInput - NPC) {
		case 0:
			winner = " too. It is a draw!";
			break;
		case 1:
			winner = ". You win!";
			break;
		case -2:
			winner = ". You win!";
			break;
		default:
			winner = ". You lose!";
		}

		/*
		 * Output result to console.
		 */
		System.out.println("");
		System.out.print("The computer is " + isNPC + ". You are " + isUser + "" + winner);

		/*
		 * Close input stream.
		 */
		consoleInput.close();
	}

}
