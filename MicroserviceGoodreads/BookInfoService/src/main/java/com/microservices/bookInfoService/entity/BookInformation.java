package com.microservices.bookInfoService.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "books", uniqueConstraints = {
		@UniqueConstraint(
				name="isbn_unique",
				columnNames = "isbn")
})
@IdClass(BookID.class)
public class BookInformation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long bookID;
	@Id
	private String isbn;
	private String name;
	private String author;
	private String description;
	private int quantity;
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Long getBookID() {
		return bookID;
	}
	public void setBookID(Long bookID) {
		this.bookID = bookID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "BookInformation [name=" + name + ", author=" + author + ", isbn=" + isbn + ", description="
				+ description + "]";
	}
	
	
}
