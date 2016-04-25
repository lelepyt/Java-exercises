package org.exercises.sortdeckofcardslist;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cards {

	private List<Card> deck = new ArrayList<>();

	public Cards() {
		fillDeck();
	}
	
	public List<Card> getDeck() {
		return deck;
	}

	public void fillDeck() {
		int[] numbers = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
		String[] suits = { "spades", "worms", "clubs", "diamonds" };

		for (int number : numbers) {
			for (String suit : suits) {
				Card card = new Card();
				card.setFields(number, suit);
				deck.add(card);
			}
		}
	}
	

	public void sortDeck() {
		boolean swapped = true;
		int z = 0;
		while (swapped) {
			swapped = false;
			for (int i = 0; i < deck.size() - 1 - z; i++) {
				if (deck.get(i).number > deck.get(i + 1).number) {
					swap(deck, i, i + 1);
					swapped = true;
				}
			}
			z++;
		}
	}

	public void output() {
		for (int i = 0; i < deck.size(); i++) {
			System.out.print(deck.get(i).number + "  " + deck.get(i).suit + "      ");
			if ((i + 1) % 4 == 0 && i > 2)
				System.out.println();
		}
		System.out.println();
	}

	public void shuffleDeck() {
		int numberOfItemsArray = deck.size();
		Random random = new Random();
		random.nextInt();
		for (int i = 0; i < numberOfItemsArray; i++) {
			int change = i + random.nextInt(numberOfItemsArray - i);
			swap(deck, i, change);
		}
	}

	private void swap(List<Card> a, int i, int change) {
		Card temp = a.get(i);
		a.set(i, a.get(change));
		a.set(change, temp);
	
	}
	public void printDeck() {
		for (Card card : deck) {
			System.out.print(card + ", ");
		}
	}
}


	