package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.entity.User;
import com.example.service.UserService;

@SpringBootApplication
//@Configuration
//@ComponentScan(basePackages = "com.example")
//@EnableAutoConfiguration
public class SpringBootJpaExampleApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaExampleApplication.class, args);
		System.out.println("-- Application Started Runing --");
	}

	@Override
	public void run(String... args) throws Exception {

		// Create users
		for (int i = 1; i <= 10; i++) {
			User user = new User("Nitin" + i, "Nitingupta" + i + "@gmail.com");
			userService.createUser(user);
		}
		System.out.println("-- Users Added sucessfully --");

		// Total Count
		userService.totalCount();

		// List Of all users
		System.out.print("-- List of all users in the database --");

		List<User> users = userService.getAllUsers();

		int i = 0;
		while (i < users.size()) {
			User user = users.get(i);
			System.out.println("Id = " + user.getId());
			System.out.println("Name = " + user.getName());
			System.out.println("Email = " + user.getEmail());
			i++;
		}

	}
}
