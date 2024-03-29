package com.jaya.security.springsecurityauthserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.jaya.security.springsecurityauthserver.service.CustomUserDetailsService;

@Configuration
public class ApplicationConfig {
	
	@Bean
	public BCryptPasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public UserDetailsService userDetails()
	{
		return new CustomUserDetailsService();
	}

}
