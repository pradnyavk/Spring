package com.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.spring.entities.User;
import com.example.spring.repository.UserRepository;
import com.example.spring.service.UserDAOService;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {

	@Autowired
	private UserDAOService userDaoService;
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		User user = new User("Pradnya","pradnya");
		
//		userDaoService.save(user);
		
		userRepository.save(user);
	}

}
