package com.microservices.BookCatalogService.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.microservices.BookCatalogService.entity.BookCatalog;
import com.microservices.BookCatalogService.model.BookInformation;
import com.microservices.BookCatalogService.model.RatingWithBookInfo;
import com.microservices.BookCatalogService.model.Ratings;
import com.microservices.BookCatalogService.model.User;

@RestController
@RequestMapping("/catalog")
public class BookCatalogController {
	
	//user rest template to get the users
	RestTemplate restTemplate = new RestTemplate();
	
	@GetMapping("/{uname}")
	public BookCatalog getUserCatalog(@PathVariable("uname") String uname) {
		BookCatalog bookCatalog = new BookCatalog();
		RatingWithBookInfo bookRating = new RatingWithBookInfo();
		List<RatingWithBookInfo> bookRatings = new ArrayList<RatingWithBookInfo>();
		
		User u = restTemplate.getForObject("http://localhost:8083/users/" + uname, User.class);
		bookCatalog.setUname(u.getUname());
		bookCatalog.setEmail(u.getEmail());
		
		for(Ratings rating : u.getRatings()) {
			
			BookInformation bookInfo = restTemplate.getForObject("http://localhost:8082/books/" + rating.getIsbn(), BookInformation.class);
			
			
			bookRating.setAuthor(bookInfo.getAuthor());
			bookRating.setDescription(bookInfo.getDescription());
			bookRating.setIsbn(bookInfo.getIsbn());
			bookRating.setName(bookInfo.getName());
			bookRating.setRating(rating.getRatings());
			
			bookRatings.add(bookRating);
		}
		bookCatalog.setBooksAndRatings(bookRatings);
		
		return bookCatalog;
	}
	
	
	
}
