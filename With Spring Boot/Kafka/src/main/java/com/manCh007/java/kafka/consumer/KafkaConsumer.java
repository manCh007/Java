package com.manCh007.java.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.manCh007.java.kafka.model.Student;

@Service
public class KafkaConsumer {
	
	@KafkaListener(topics = "dummy_topic", groupId = "group_id")
	public Student consumeMessage(String message) {
		System.out.println(message);
		return null;
	}

}
