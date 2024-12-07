package com.kle.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	@GetMapping("/home")
	public String method1() {
		return "wlcome to sb";
	}
	

}
