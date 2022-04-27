package com.microservices.UserService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.microservices.UserService.entity.User;

public interface UserRepo extends JpaRepository<User, Long>{
	
	@Query("select u from User u where u.uname = ?1")
	public User getByUname(String uname);
}
