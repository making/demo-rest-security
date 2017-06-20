package com.example.demo.security;

import java.util.Collections;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class DemoUserDetailsService implements UserDetailsService {
	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		// Any username is OK as long as password is "password"
		return new User(username, "password", Collections.emptyList());
	}
}
