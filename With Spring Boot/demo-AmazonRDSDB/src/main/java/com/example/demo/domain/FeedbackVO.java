package com.example.demo.domain;

public class FeedbackVO {
	
	private String userEmail;
	private String feedbackMsg;
	
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getFeedbackMsg() {
		return feedbackMsg;
	}
	public void setFeedbackMsg(String feedbackMsg) {
		this.feedbackMsg = feedbackMsg;
	}
	public FeedbackVO(String userEmail, String feedbackMsg) {
		super();
		this.userEmail = userEmail;
		this.feedbackMsg = feedbackMsg;
	}
	public FeedbackVO() {

	}
}
