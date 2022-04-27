package com.microservices.UserService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.UserService.entity.Ratings;
import com.microservices.UserService.entity.RatingsID;

public interface RatingsRepo extends JpaRepository<Ratings, RatingsID>{

}
