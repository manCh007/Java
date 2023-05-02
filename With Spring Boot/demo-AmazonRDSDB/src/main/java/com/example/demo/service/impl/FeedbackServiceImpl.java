package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.FeedbackDao;
import com.example.demo.domain.FeedbackVO;
import com.example.demo.service.FeedbackService;

@Service
public class FeedbackServiceImpl implements FeedbackService {

	@Autowired
	private FeedbackDao feedbackDao;
	
	@Override
	public String saveFeedback(FeedbackVO feedback) {
		return feedbackDao.saveFeedback(feedback);
	}

}
