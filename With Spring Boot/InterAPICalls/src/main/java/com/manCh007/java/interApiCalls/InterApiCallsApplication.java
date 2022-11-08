package com.manCh007.java.interApiCalls;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * This is the main class
 * @author Manab Chatterjee
 *
 */

@SpringBootApplication
@EnableFeignClients
public class InterApiCallsApplication {

	/**
	 * this is the main method
	 * @param args
	 */
	
	public static void main(String[] args) {
		SpringApplication.run(InterApiCallsApplication.class, args);
	}
	
	/**
	 * This method helps create the restTemplate bean
	 * @return
	 */
	
	@Bean
	public RestTemplate getTemplate() {
		return new RestTemplate();
	}

	/**
	 * This method helps create the Webclient bean
	 * @return
	 */
	
	@Bean
	public WebClient getWebClient() {
		return WebClient.builder().baseUrl("http://localhost:8083/interApiCommunication").build();
	}
}
