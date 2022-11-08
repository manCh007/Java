package com.manCh007.java.MultiThread.config;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * This is the configuration class which helps to create the 
 * ExecutorService for the Executor to work
 * @author Manab Chatterjee
 *
 */

@Configuration
public class ThreadConfig {
	
	@Autowired
	CustomThreadConfigProperties config;

	/**
	 * This is the executor service bean
	 * @return
	 */
	@Bean(name = "executorThread")
	public ExecutorService getExecutor() {
		
		// This is fixed thread executor service : It uses a fixed number of threads and keeps the task on hold until one 
		// thread is free
		ExecutorService exec = Executors.newFixedThreadPool(config.getThreadCount());
		
		// This is Cached Thread executor service : It creates new thread while all other threads in the pool is busy and 
		// once the execution is done it kills the thread
		//ExecutorService exec = Executors.newCachedThreadPool();
		
		// This is single thread executor which creates one thread and then executes sequentially
		//ExecutorService exec = Executors.newSingleThreadExecutor();
		
		// This is a scheduled to create threads after an interval
		//ExecutorService exec = Executors.newScheduledThreadPool(config.getThreadCount());
		
		return exec;	
	}
}