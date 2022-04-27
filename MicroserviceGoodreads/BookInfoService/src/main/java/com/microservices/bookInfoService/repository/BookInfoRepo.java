package com.microservices.bookInfoService.repository;

import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.microservices.bookInfoService.entity.BookInformation;

@Repository
@Scope("singleton")
public interface BookInfoRepo extends JpaRepository<BookInformation, Long> {
	@Query("select b from BookInformation b where b.isbn=?1")
	public BookInformation findByIsbn(String isbn);
}
