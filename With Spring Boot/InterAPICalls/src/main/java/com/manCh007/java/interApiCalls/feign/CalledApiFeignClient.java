package com.manCh007.java.interApiCalls.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * this is the feign schematic interface
 * @author Manab Chatterjee
 *
 */

@FeignClient(name = "interApi-communication", url = "localhost:8083/interApiCommunication")
public interface CalledApiFeignClient {
	
	/**
	 * Client method signature
	 * @return
	 */
	
	@GetMapping("/apiCalled")
	public String apiToBeCalled();

}
