package com.microservices.bookInfoService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.microservices.bookInfoService.entity.BookInformation;
import com.microservices.bookInfoService.repository.BookInfoRepo;
import com.microservices.bookInfoService.service.BookInfoService;

@RestController
@RequestMapping("/books")
public class BookInfoController {
	
	@Autowired
	private BookInfoService bookInfoService;
	
	@Autowired
	private BookInfoRepo bookInfoRepo;
	
	@GetMapping("/getall")
	public List<BookInformation> getBookInfo(){
		return bookInfoService.getBooks();
	}
	
	@GetMapping("/{isbn}")
	public BookInformation getBookWithIsbn(@PathVariable("isbn") String isbn) {
		return bookInfoService.getBookByIsbn(isbn);
	}
	
	@PostMapping(value = "/postBook", consumes = {"application/json"})
	public BookInformation postbookInfo(@RequestBody BookInformation bookInfo) {
		return bookInfoRepo.save(bookInfo);
	}
}
