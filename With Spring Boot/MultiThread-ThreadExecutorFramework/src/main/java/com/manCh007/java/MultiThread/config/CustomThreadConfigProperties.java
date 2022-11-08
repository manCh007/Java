package com.manCh007.java.MultiThread.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * This is the configuration properties bean to pick the config from properties
 * @author Manab Chatterjee
 */

@Configuration
@ConfigurationProperties(prefix = "thread")
public class CustomThreadConfigProperties {
	/**
	 * This defines the number of desired count you want
	 */
	private int threadCount;

	public int getThreadCount() {
		return threadCount;
	}

	public void setThreadCount(int threadCount) {
		this.threadCount = threadCount;
	}
	
}
