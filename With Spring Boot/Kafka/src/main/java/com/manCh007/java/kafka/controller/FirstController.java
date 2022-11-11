package com.manCh007.java.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manCh007.java.kafka.model.Student;

@RestController
@RequestMapping("/kafka")
public class FirstController {

	@Autowired
	private KafkaTemplate<String, String> template;
	
	@PostMapping("/publishToKafka")
	public String publishToKafka(@RequestBody Student student) {
		String message = student.toString();
		System.out.println(message);
		template.send("dummy_topic", message);
		return "Message published to kafka";
	}
}
