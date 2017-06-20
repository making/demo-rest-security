package com.example.demo.hello;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Sample REST API
 */
@RestController
public class HelloController {
	@GetMapping("/hello")
	String hello(@AuthenticationPrincipal UserDetails userDetails)
			throws InterruptedException {
		Thread.sleep(500);
		return "Hello " + userDetails.getUsername() + "!";
	}
}
