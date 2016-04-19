package org.exercises.setsort;

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

	public static Comparator getAgeComparator() {
		return new AgeComparator();
	}

	static class AgeComparator implements Comparator {
		public int compare(Object o1, Object o2) {
			return (((User) o1).age > ((User) o2).age) ? 1 : -1;
		}
	}

	public static Comparator getReverseAgeComparator() {
		return new ReverseAgeComparator();
	}

	static class ReverseAgeComparator implements Comparator {
		public int compare(Object o1, Object o2) {
			return (((User) o1).age < ((User) o2).age) ? 1 : -1;
		}
	}

}
