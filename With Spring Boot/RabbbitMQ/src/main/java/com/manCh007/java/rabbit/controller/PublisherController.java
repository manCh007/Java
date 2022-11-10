package com.manCh007.java.rabbit.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manCh007.java.rabbit.model.Student;

@RestController
@RequestMapping("/rmq")
public class PublisherController {
	
	@Autowired
	@Qualifier("template")
	private AmqpTemplate template;
	
	@PostMapping("/publishRMQ")
	public String publishRMQ(@RequestBody Student student) {
		template.convertAndSend("test,dummy", "test.routingKey", student);
		return "Message published";
	}

}
