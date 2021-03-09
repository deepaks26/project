package com.inter.design.builder;

public class User {

	private final String firstName;
	private final String lastName;
	private final int age;
	private final String email;

	public User(UserBuilder userbuilder) {
		this.firstName = userbuilder.firstName;
		this.lastName = userbuilder.lastName;
		this.age = userbuilder.age;
		this.email = userbuilder.email;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String getEmail() {
		return email;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (age != other.age)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", email=" + email + "]";
	}


	public static class UserBuilder {
		private final String firstName;
		private final String lastName;
		private int age;
		private String email;

		public UserBuilder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public UserBuilder age(int age) {
			this.age = age;
			return this;
		}

		public UserBuilder email(String email) {
			this.email = email;
			return this;
		}

		public User build() {
			User us = new User(this);
			return us;
		}

	}
	
	
	public static void main(String[] args) {
		User user1 = new User.UserBuilder("a", "b").age(30).email("aabb").build();
		System.out.println(user1);
	}

}
