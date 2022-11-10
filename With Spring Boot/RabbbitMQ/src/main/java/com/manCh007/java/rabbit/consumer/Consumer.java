package com.manCh007.java.rabbit.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.manCh007.java.rabbit.model.Student;

@Service
public class Consumer {
	
	@RabbitListener(queues = "test.dummy")
	public void consume(Student message) {
		System.out.println(message);
	}

}
