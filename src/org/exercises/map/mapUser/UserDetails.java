package org.exercises.map.mapUser;

public class UserDetails {
	private String married;
	private String address;
	private String phoneNumber;

	public UserDetails(String married, String address, String phoneNumber) {
		this.married = married;
		this.address = address;
		this.phoneNumber = phoneNumber;

	}

	public String getMarried() {
		return married;
	}

	public String getAddress() {
		return address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!User.class.isAssignableFrom(obj.getClass())) {
			return false;
		}
		final UserDetails other = (UserDetails) obj;
		if (!this.married.equals(other.married)) {
			return false;
		}
		if (!this.address.equals(other.address)) {
			return false;
		}
		if (!this.phoneNumber.equals(other.phoneNumber)) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		int hash = 37;
		hash = hash + (this.married != null ? this.married.hashCode() : 0);
		hash = hash + (this.address != null ? this.address.hashCode() : 0);
		hash = hash + (this.phoneNumber != null ? this.phoneNumber.hashCode() : 0);
		return hash;
	}

	public String toString() {
		return "UserDetails [married = " + this.married + ", address = " + this.address + ", phoneNumber = "
				+ this.phoneNumber + "]";
	}
}
