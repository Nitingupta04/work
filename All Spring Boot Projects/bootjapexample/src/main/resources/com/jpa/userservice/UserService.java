package com.jpa.userservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jap.test.dao.UserRepository;
import com.jpa.test.entities.User;

@Service
public class UserService {

	@Autowired
	private UserRepository userrepo;

	public List<User> getUser() {
		System.out.println("-- Inside getUser() in class UserService --");
		return userrepo.findAll();
	}

	public User getUserId(long id) {
		System.out.println("-- Inside UserId() in class UserService --");
		return userrepo.findById(id).orElse(null);
	}

	public User createUser(User user) {
		System.out.println("-- Inside createUser() in class UserService --");
		return userrepo.save(user);
	}

	public User updateUser(long id, User userdetails) {
		System.out.println("-- Inside updateUser() in class UserService --");
		User user = userrepo.findById(id).orElse(null);

		if (user != null) {
			user.setName(userdetails.getName());
			user.setEmail(userdetails.getEmail());
			return userrepo.save(user);
		}

		return null;
	}

	public void deleteUser(long id) {
		userrepo.deleteById(id);
	}

}
