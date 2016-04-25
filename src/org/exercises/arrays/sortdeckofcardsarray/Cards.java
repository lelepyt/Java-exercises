package org.exercises.sortdeckofcardsarray;

import java.util.Random;

public class Cards {

	private Card deck[] = new Card[52];

	public Cards() {
		fillDeck();
	}

	public Card[] getDeck() {
		return deck;
	}

	public void fillDeck() {
		int[] numbers = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
		String[] suits = { "spades", "worms", "clubs", "diamonds" };

		int i = 0;
		for (int number : numbers) {
			for (String suit : suits) {
				Card card = new Card();
				card.setFields(number, suit);
				deck[i++] = card;
			}
		}
	}

	public void sortDeck() {
		boolean swapped = true;
		int z = 0;
		while (swapped) {
			swapped = false;
			for (int i = 0; i < deck.length - 1 - z; i++) {
				if (deck[i].number > deck[i + 1].number) {
					swap(deck, i, i + 1);
					swapped = true;
				}
			}
			z++;
		}
	}

	public void output() {
		for (int i = 0; i < deck.length; i++) {
			System.out.print(deck[i].number + "  " + deck[i].suit + "      ");
			if ((i + 1) % 4 == 0 && i > 2)
				System.out.println();
		}
		System.out.println();
	}

	public void shuffleDeck() {
		int numberOfItemsArray = deck.length;
		Random random = new Random();
		random.nextInt();
		for (int i = 0; i < numberOfItemsArray; i++) {
			int change = i + random.nextInt(numberOfItemsArray - i);
			swap(deck, i, change);
		}
	}

	public void swap(Card[] a, int i, int change) {
		Card temp = a[i];
		a[i] = a[change];
		a[change] = temp;
	}
}
