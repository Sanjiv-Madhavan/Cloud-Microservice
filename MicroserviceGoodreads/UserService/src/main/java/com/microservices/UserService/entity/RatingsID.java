package com.microservices.UserService.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.EqualsAndHashCode;

@Embeddable
@EqualsAndHashCode
public class RatingsID implements Serializable{
	private long ratingID;
	private String isbn;
	public long getUid() {
		return ratingID;
	}
	public void setUid(long uid) {
		this.ratingID = uid;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
}
