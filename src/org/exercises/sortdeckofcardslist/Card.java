package org.exercises.sortdeckofcardslist;

class Card  {
	int number;
	String suit;

	public void setFields(int number, String suit) {
		this.number = number;
		this.suit = suit;
	
	}
	
	@Override
	public String toString() {	
		return String.valueOf(number);
	}
}