package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.FeedbackVO;
import com.example.demo.domain.RegistrationVO;
import com.example.demo.domain.UserDetailsVO;
import com.example.demo.service.FeedbackService;
import com.example.demo.service.UserService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/demo/api/v1.0/user")
public class FeedbackRegisterController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private FeedbackService feedbackService;
	
	@PostMapping(value = "/feedback")
	public UserDetailsVO userFeedback(@RequestBody RegistrationVO registerationDetails) {
		System.out.println("Request: "+registerationDetails.toString());
		UserDetailsVO user = registerationDetails.getUser();
		FeedbackVO feedback = new FeedbackVO(user.getEmail(), registerationDetails.getFeedback());
		feedbackService.saveFeedback(feedback);
		// Call service method to trigger an webClient Call to 
		// send email to registered user's email
		return userService.saveUser(user);
	}

}
