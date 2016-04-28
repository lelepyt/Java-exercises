package org.exercises.set.set;

import java.util.Set;

public class MySet {
	
	private Set<String> set;

	public void setSet(Set<String> s) {
		this.set = s;
	}

	public Set<String> getSet() {
		return set;
	}

	public void addObjectsInSet() {
		String[] string = { "Volodya", "London is", "the capital", "of", "Great Britain.", "Volodya" };
		for (String s : string) {
			set.add(s);
		}
	}

	public void addNULLsInSet() {
		try {
			for (int i = 0; i < 10; i++) {
				set.add(null);
			}
		} catch (NullPointerException ex) {
			System.out.println("I can`t add null pointer in this set");
		}
	}

	public void printSet() {
		for (int i = 0; i < set.size(); i++) {
			System.out.println(set.toArray()[i] + " ");
		}
		System.out.print("\n");
	}

}