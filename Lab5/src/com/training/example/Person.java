package com.training.example;

public class Person {
	private String firstName;
	private String desgination;
	private String email;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String firstName, String desgination, String email) {
		super();
		this.firstName = firstName;
		this.desgination = desgination;
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getDesgination() {
		return desgination;
	}
	public void setDesgination(String desgination) {
		this.desgination = desgination;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", desgination=" + desgination + ", email=" + email + "]";
	}

}
