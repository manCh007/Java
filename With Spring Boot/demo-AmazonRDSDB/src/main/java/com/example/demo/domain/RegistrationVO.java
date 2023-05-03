package com.example.demo.domain;

public class RegistrationVO {
	
	private UserDetailsVO user;
	private String feedback;
	public UserDetailsVO getUser() {
		return user;
	}
	public void setUser(UserDetailsVO user) {
		this.user = user;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public RegistrationVO(UserDetailsVO user, String feedback) {
		super();
		this.user = user;
		this.feedback = feedback;
	}
	public RegistrationVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "RegistrationVO [user=" + user.toString() + ", feedback=" + feedback + "]";
	}
	
	
}
