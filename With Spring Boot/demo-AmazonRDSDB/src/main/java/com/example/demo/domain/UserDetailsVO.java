package com.example.demo.domain;


public class UserDetailsVO {
	
	private String firstName;
	private String lastName;
	private String userEmail;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public UserDetailsVO(String firstName, String lastName, String userEmail) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userEmail = userEmail;
	}
	public UserDetailsVO() {
		
	}
}
