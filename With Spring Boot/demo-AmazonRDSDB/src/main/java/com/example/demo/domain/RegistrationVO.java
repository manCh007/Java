package com.example.demo.domain;

public class RegistrationVO {
	
	private UserDetailsVO user;
	private String feedbackMsg;
	
	public UserDetailsVO getUser() {
		return user;
	}
	public void setUser(UserDetailsVO user) {
		this.user = user;
	}
	public String getFeedbackMsg() {
		return feedbackMsg;
	}
	public void setFeedbackMsg(String feedbackMsg) {
		this.feedbackMsg = feedbackMsg;
	}
	public RegistrationVO(UserDetailsVO user, String feedbackMsg) {
		super();
		this.user = user;
		this.feedbackMsg = feedbackMsg;
	}
	public RegistrationVO() {
		
	}
}
