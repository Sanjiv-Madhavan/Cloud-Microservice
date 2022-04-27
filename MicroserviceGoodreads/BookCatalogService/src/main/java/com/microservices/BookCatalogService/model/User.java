package com.microservices.BookCatalogService.model;

import java.util.List;

public class User {
	
	private long uid;
	private String uname;
	private String email;
	private List<Ratings> ratings;
	
	public long getUid() {
		return uid;
	}
	public void setUid(long uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public List<Ratings> getRatings() {
		return ratings;
	}
	public void setRatings(List<Ratings> ratings) {
		this.ratings = ratings;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", email=" + email + ", ratings=" + ratings + "]";
	}
	
	
}
