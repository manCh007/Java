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
		ExecutorService exec = Executors.newFixedThreadPool(config.getThreadCount());
		return exec;	
	}
}