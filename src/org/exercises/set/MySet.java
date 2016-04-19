package org.exercises.set;

import java.util.Set;

class MySet {
	Set set;

	public void setSet(Set s) {
		this.set = s;
	}

	public void addElements() {
		set.add("Volodya");
		set.add("London is");
		set.add("the capital");
		set.add("of");
		set.add("Great Britain.");
		set.add("Volodya");
	}

	public void addNULLs() throws NullPointerException {
		try {
			set.add(null);
			set.add(null);
			set.add(null);
			set.add(null);
			set.add(null);
		} catch (NullPointerException n) {
			System.out.println("I can`t add null pointer in this set");
		}
	}

	public String toString() {
		for (int i = 0; i < set.size(); i++) {
			System.out.println(set.toArray()[i] + " ");
		}
		System.out.println();
		return null;
	}

}