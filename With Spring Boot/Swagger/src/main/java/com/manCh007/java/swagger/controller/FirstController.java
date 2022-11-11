package com.manCh007.java.swagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/swagger")
public class FirstController {

	@GetMapping("/getMessage")
	public String getMessage() {
		return "Message";
	}
}
