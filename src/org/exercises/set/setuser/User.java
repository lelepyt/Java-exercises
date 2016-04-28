package org.exercises.set.setuser;

public class User {
	String name;
	String surname;
	String username;
	int age;

	public User(String name, String surname, String username, int age) {
		this.name = name;
		this.surname = surname;
		this.username = username;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!User.class.isAssignableFrom(obj.getClass())) {
			return false;
		}
		final User other = (User) obj;
		if (!this.name.equals(other.name)) {
			return false;
		}
		if (!this.surname.equals(other.surname)) {
			return false;
		}
		if (!this.username.equals(other.username)) {
			return false;
		}
		if (this.age != other.age) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		int hash = 3;
		hash = 53 * hash + (this.name != null ? this.name.hashCode() : 0);
		hash = 53 * hash + (this.surname != null ? this.surname.hashCode() : 0);
		hash = 53 * hash + (this.username != null ? this.username.hashCode() : 0);
		hash = 53 * hash + this.age;
		return hash;
	}
}
