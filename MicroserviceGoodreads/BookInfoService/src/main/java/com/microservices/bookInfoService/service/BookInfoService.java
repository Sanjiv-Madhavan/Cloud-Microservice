package com.microservices.bookInfoService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.bookInfoService.repository.BookInfoRepo;
import com.microservices.bookInfoService.entity.BookInformation;

@Service
public class BookInfoService {

	@Autowired
	private BookInfoRepo bookInforepo;
	
	public List<BookInformation> getBooks(){
		return bookInforepo.findAll();
	}
	
	public BookInformation getBookByIsbn(String isbn) {
		return bookInforepo.findByIsbn(isbn);
	}
}
