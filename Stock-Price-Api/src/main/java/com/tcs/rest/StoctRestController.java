package com.tcs.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stockrest")
public class StoctRestController {
	
	@GetMapping("/welcome")
	public String getMsg() {
		return "Welcome to Stocke API";
	}

}
