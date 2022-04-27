package com.microservices.UserService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.UserService.dto.UserDetails;
import com.microservices.UserService.entity.User;
import com.microservices.UserService.repository.RatingsRepo;
import com.microservices.UserService.repository.UserRepo;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserRepo userRepository;
	
	@Autowired
	private RatingsRepo ratingsRepository;
	
	@GetMapping("/getall")
	public List<User> getUsersAndRatings() {
		return userRepository.findAll();
	}
	
	@PostMapping(value = "/postuserandratings", consumes = {"application/json"})
	public User postUserAndRatings(@RequestBody UserDetails request) {
		return userRepository.save(request.getUser());
	}
	
	@PostMapping(value="/postuser", consumes = {"application/json"})
	public User postUser(@RequestBody User user)
	{
		return userRepository.save(user);
	}
	
	@GetMapping("/{uname}")
	public User getUserWithRatings(@PathVariable("uname") String uname) {
		return userRepository.getByUname(uname);
	}
}
