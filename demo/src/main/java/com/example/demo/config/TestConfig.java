package com.example.demo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.demo.repositories.UserRepository;
import com.example.demo.src.model.Entities.User;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User user1 = new User( "rodrigo", "rodrigo0990@rodrigues", "9999", "1234");
		User user2 = new User( "marelene", "marlene0990@rodrigues", "9999", "1234");

		userRepository.saveAll(Arrays.asList(user1,user2));
		
	}

}
