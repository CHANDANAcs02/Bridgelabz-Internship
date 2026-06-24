package com.bridgelabz.oops;

import java.util.Random;

public class DeckOfCards {

	public static void main(String[] args) {

		// Suits of cards
		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };

		// Ranks of cards
		String[] ranks = { "2", "3", "4", "5", "6", "7", "8",
				"9", "10", "Jack", "Queen", "King", "Ace" };

		// Create a deck of 52 cards
		String[] deck = new String[52];

		int index = 0;

		for (int i = 0; i < suits.length; i++) {

			for (int j = 0; j < ranks.length; j++) {

				deck[index++] = ranks[j] + " of " + suits[i];
			}
		}

		// Shuffle the deck
		Random random = new Random();

		for (int i = 0; i < deck.length; i++) {

			int randomIndex = random.nextInt(52);

			String temp = deck[i];
			deck[i] = deck[randomIndex];
			deck[randomIndex] = temp;
		}

		// Distribute 9 cards to 4 players
		String[][] players = new String[4][9];

		index = 0;

		for (int player = 0; player < 4; player++) {

			for (int card = 0; card < 9; card++) {

				players[player][card] = deck[index++];
			}
		}

		// Display cards received by each player
		for (int player = 0; player < 4; player++) {

			System.out.println("\nPlayer " + (player + 1) + " Cards:");

			for (int card = 0; card < 9; card++) {

				System.out.println(players[player][card]);
			}
		}
	}
}