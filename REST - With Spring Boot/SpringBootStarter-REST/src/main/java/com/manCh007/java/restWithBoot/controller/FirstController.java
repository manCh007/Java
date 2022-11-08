package com.manCh007.java.restWithBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This is one Rest Controller Class where we will define our endpoints
 * @author Manab Chatterjee
 */

@RestController
@RequestMapping("/restBasic")
public class FirstController {
	
	/**
	 * This is a getMapping to greet people
	 * @return
	 */
	
	@GetMapping("/greeting")
	public String greetings() {
		return "HELLO ALL !!";
	}

}
