package com.example.loginapp.controller;

import com.example.loginapp.model.User;
import jakarta.validation.Valid;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
	
//	@Autowired
//	User user;

	@GetMapping("/login")
	public String showLoginForm(Model model) {
		model.addAttribute("user", new User());
		return "login";
	}

	@PostMapping("/login")
	public String login(@Valid @ModelAttribute("user") User user, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "login";
		}
		
		// Simple validation: username and password must match
		
		if ("admin".equals(user.getUsername()) && "admin".equals(user.getPassword())) {
			return "home"; 
			// Redirect to home page if login is successful
		}
		model.addAttribute("errorMessage", "Invalid username or password");
		return "login";
	}

}
