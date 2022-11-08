package com.manCh007.java.MultiThread.controller;

import java.util.concurrent.ExecutorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This is just a controller class which helps to test
 * @author Manab Chatterjee
 *
 */

@RestController
@RequestMapping("/multiThread")
public class FirstController {
	
	/**
	 * Getting the executor service object
	 */
	
	@Autowired
	@Qualifier(value = "executorThread")
	ExecutorService executor;
	
	@GetMapping("/getFixedThread")
	public void triggerThread() {
		for(int i=0; i<200; i++) {
			executor.execute(() -> { //Operating on the executor to create multiple threads
				System.out.println("Thread #" + Thread.currentThread().getName());
				try {
					Thread.sleep(3000); // Defining a delay to make the generation observable
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			});
		}
	}

}
