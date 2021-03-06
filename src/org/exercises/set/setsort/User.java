package org.exercises.set.setsort;

import java.util.Comparator;

public class User {
	public String name;
	public String surname;
	public String username;
	public int age;

	public User(String name, String surname, String username, int age) {
		this.name = name;
		this.surname = surname;
		this.username = username;
		this.age = age;
	}

	public static Comparator<Object> getAgeComparator() {
		return new AgeComparator();
	}

	private static class AgeComparator implements Comparator<Object> {
		public int compare(Object o1, Object o2) {
			return (((User) o1).age > ((User) o2).age) ? 1 : -1;
		}
	}

	public static Comparator<Object> getReverseAgeComparator() {
		return new ReverseAgeComparator();
	}

	private static class ReverseAgeComparator implements Comparator<Object> {
		public int compare(Object o1, Object o2) {
			return (((User) o1).age < ((User) o2).age) ? 1 : -1;
		}
	}

}
