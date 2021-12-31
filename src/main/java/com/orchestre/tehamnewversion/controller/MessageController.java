package com.orchestre.tehamnewversion.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
	
	@RequestMapping("/hello")
	public String Hello() {
		
		return "Hello World!";
	}

}
