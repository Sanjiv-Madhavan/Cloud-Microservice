package com.microservices.BookCatalogService.model;


public class BookInformation {
	private long bookID;
	private String isbn;
	private String name;
	private String author;
	private String description;
	private int quantity;
	public long getBookID() {
		return bookID;
	}
	public void setBookID(long bookID) {
		this.bookID = bookID;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "BookInformation [bookID=" + bookID + ", isbn=" + isbn + ", name=" + name + ", author=" + author
				+ ", description=" + description + ", quantity=" + quantity + "]";
	}
	
	
}
