package org.exercises.arrays.sortdeckofcardsarray;

public class Main {

	public static void main(String[] argv) {
		Cards cards = new Cards();
		cards.sortDeck();
		System.out.println("Sorted deck:");
		cards.output();
		cards.shuffleDeck();
		System.out.println("Shuffled deck:");
		cards.output();
	}
}
