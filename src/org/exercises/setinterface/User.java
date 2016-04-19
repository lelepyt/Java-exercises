package org.exercises.setinterface;

import java.util.Comparator;

public class User {
	String name;
	String surname;
	String username;
	int age;

	User(String name, String surname, String username, int age) {
		this.name = name;
		this.surname = surname;
		this.username = username;
		this.age = age;
	}

	static NameComparator nameComparator = new NameComparator();

	public static Comparator getNameComparator() {
		return nameComparator;
	}

	static class NameComparator implements Comparator {
		public int compare(Object o1, Object o2) {
			return ((User) o1).name.compareTo(((User) o2).name);
		}
	}

}
