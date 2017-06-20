package com.example.demo.token;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Endpoint to generate tokens
 */
@RestController
public class TokenController {

	@PostMapping(path = "token")
	String token() {
		return "OK";
	}
}
