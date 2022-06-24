package com.qa.datatype.domain;

public class Customer {
	private String firstName;
	private String surname;
	private String email;
	private int age;
	
	public Customer(String firstName, String surname, String email, int age) {
		super();
		this.firstName = firstName;
		this.surname = surname;
		this.email = email;
		this.age = age;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return String.format("The customer is %s %s, %d Please contact him at: %s", firstName, surname, age, email);
	}
}


