package com.manCh007.java.interApiCalls.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.manCh007.java.interApiCalls.feign.CalledApiFeignClient;

import reactor.core.publisher.Mono;

/**
 * This is a rest controller which holds the api that needs to be called and the api which will call it
 * @author Manab Chatterjee
 *
 */

@RestController
@RequestMapping("/interApiCommunication")
public class FirstController {
	
	@Autowired
	RestTemplate template;
	
	@Autowired
	CalledApiFeignClient feignClient;
	
	@Autowired
	WebClient webClient;
	
	/**
	 * This is the api that will be called
	 * @return
	 */
	
	@GetMapping("/apiCalled")
	public String apiToBeCalled() {
		return "This is the called Api";
	}
	
	/**
	 * This is the api that is calling
	 * based on the request params we are routing the flow to any type of call
	 * @param type
	 * @return
	 */
	
	@GetMapping("/callApi")
	public String callApi(@RequestParam("type") String type) {
		if(type.equalsIgnoreCase("RestTemplate"))
			return callApiusingRestTemplate();
		else if(type.equalsIgnoreCase("Feign"))
			return callApiusingFeign();
		else if(type.equalsIgnoreCase("WebClient"))
			return callApiusingWebclient();
		return null;
	}
	
	/**
	 * Calls the API using RestTemplate
	 * @return
	 */
	
	public String callApiusingRestTemplate() {
		String stringObject = template.getForObject("http://localhost:8083/interApiCommunication/apiCalled", String.class);
		return stringObject;
	}
	
	/**
	 * Calls the api Using Feign
	 * @return
	 */
	
	public String callApiusingFeign() {
		String stringObject = feignClient.apiToBeCalled();
		return stringObject;
	}
	
	/**
	 * Calls the api using WebClient
	 * @return
	 */
	
	public String callApiusingWebclient() {
		Mono<String> bodyToMono = webClient.get()
				.uri("/apiCalled")
				.retrieve()
				.bodyToMono(String.class);
		return bodyToMono.block();
	}

}
