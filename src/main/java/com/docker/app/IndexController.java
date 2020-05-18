package com.docker.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	@GetMapping("/hello")
	public String test() {
		return "Hello from docker ";
	}
	
	
}
