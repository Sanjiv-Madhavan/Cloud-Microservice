package com.microservices.BookCatalogService.model;

public class Ratings {
	private String isbn;
	private long ratingID;
	private int ratings;
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public long getRatingID() {
		return ratingID;
	}
	public void setRatingID(long ratingID) {
		this.ratingID = ratingID;
	}
	public int getRatings() {
		return ratings;
	}
	public void setRatings(int ratings) {
		this.ratings = ratings;
	}
	@Override
	public String toString() {
		return "Ratings [isbn=" + isbn + ", ratingID=" + ratingID + ", ratings=" + ratings + "]";
	}
	
}
