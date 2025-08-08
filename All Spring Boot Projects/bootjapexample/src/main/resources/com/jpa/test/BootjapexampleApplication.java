package com.jpa.test;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jap.test.dao.UserRepository;
import com.jpa.test.entities.User;
import com.jpa.userservice.UserService;

@SpringBootApplication(scanBasePackages = {"com.jap"})
public class BootjapexampleApplication implements CommandLineRunner {

	@Autowired(required = true)
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(BootjapexampleApplication.class, args);
		System.out.println("-- Application Started --");
	}

	@Override
	public void run(String... args) throws Exception {
		User user = new User();
		user.setName("Nitin");
		user.setCity("Bhopal");
		user.setEmail("Nitin@gmail.com");
		userRepository.save(user);
		System.out.println("User Details Added Sucessfully" +user);
	}
	
	

}
