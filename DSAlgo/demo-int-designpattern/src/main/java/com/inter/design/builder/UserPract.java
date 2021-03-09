package com.inter.design.builder;

public class UserPract {

	int age;
	String email;
	String name;
	public UserPract(UserBuilder user) {
		this.age = user.age;
		this.email = user.email;
		this.name = user.name;
	}
	
	static class UserBuilder{
		int age;
		String email;
		String name;
		
		UserBuilder(int age){
			this.age =  age;
		}
		
		UserBuilder name(String name) {
			this.name = name;
			return this;
		}
		
		UserBuilder email(String email) {
			this.email = email;
			return this;
		}
		
		UserPract build() {
			UserPract user  = new UserPract(this);
			return user;
		}
	}
	
	public static void main(String[] args) {
		UserPract user = new UserPract.UserBuilder(12).name("abc").email("abc").build();
		System.out.println(user.email);
	}
	
}
