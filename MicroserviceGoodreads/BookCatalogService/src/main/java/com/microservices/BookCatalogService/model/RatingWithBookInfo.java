package com.microservices.BookCatalogService.model;

public class RatingWithBookInfo {
	private String isbn;
	private String name;
	private String author;
	private String description;
	private int rating;
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
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "RatingWithBookInfo [isbn=" + isbn + ", name=" + name + ", author=" + author + ", description="
				+ description + ", rating=" + rating + "]";
	}
	
	
}
