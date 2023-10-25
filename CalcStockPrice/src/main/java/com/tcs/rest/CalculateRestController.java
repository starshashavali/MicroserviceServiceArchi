package com.tcs.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calcy")
public class CalculateRestController {
	
	@GetMapping("/calculate")
	public String getCalcu() {
		return "Calculating price...";
	}

}
