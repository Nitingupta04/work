package com.jpa.usercontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.jpa.test.entities.User;
import com.jpa.userservice.UserService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userservice;

	@GetMapping
	public List<User> getAllUser() {
		return userservice.getUser();
	}

	@GetMapping("/{id}")
	public User getUserById(@PathVariable Long id) {
		return userservice.getUserId(id);
	}

	@PostMapping
	public User createUser(@RequestBody User user) {
		return userservice.createUser(user);
	}

	@PutMapping("/{id}")
	public User updateUser(@PathVariable Long id , @RequestBody User user) {
		return userservice.updateUser(id, user);
	}

	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable Long id) {
		userservice.deleteUser(id);
	}

}
