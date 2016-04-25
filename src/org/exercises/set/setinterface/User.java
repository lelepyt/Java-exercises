package org.exercises.setinterface;

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

	public static NameComparator nameComparator = new NameComparator();

	public static Comparator<Object> getNameComparator() {
		return nameComparator;
	}

	public static class NameComparator implements Comparator<Object> {
		public int compare(Object o1, Object o2) {
			return ((User) o1).name.compareTo(((User) o2).name);
		}
	}

}
