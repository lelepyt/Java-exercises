package org.exercises.lists.sortdeckofcardslist;


public class Main {

	public static void main(String[] argv) {
		Cards cards = new Cards();
		cards.sortDeck();
		System.out.println("Sorted deck:");
		cards.output();
		cards.shuffleDeck();
		System.out.println("Shuffled deck:");
		cards.output();
		cards.printDeck();
	}
}
