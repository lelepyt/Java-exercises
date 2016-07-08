package org.exercises.map.mapUser;

public class User {
	private String name;
	private String surname;
	private String username;
	private String age;

	public User(String name, String surname, String username, String age) {
		this.name = name;
		this.surname = surname;
		this.username = username;
		this.age = age;
	}

	public String getUsername() {
		return username;
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
		if (!this.age.equals(other.age)) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		int hash = 37;
		hash = hash + (this.name != null ? this.name.hashCode() : 0);
		hash = hash + (this.surname != null ? this.surname.hashCode() : 0);
		hash = hash + (this.username != null ? this.username.hashCode() : 0);
		hash = hash + (this.age != null ? this.age.hashCode() : 0);
		return hash;
	}

	public String toString() {
		return "User [name = " + this.name + ", surname = " + this.surname + ", username = " + this.username
				+ ", age = " + this.age + "]";
	}
}
