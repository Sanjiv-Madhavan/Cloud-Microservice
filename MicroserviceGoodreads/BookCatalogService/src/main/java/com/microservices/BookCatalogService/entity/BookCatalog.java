package com.microservices.BookCatalogService.entity;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;

import com.microservices.BookCatalogService.model.BookInformation;
import com.microservices.BookCatalogService.model.RatingWithBookInfo;
import com.microservices.BookCatalogService.model.Ratings;
import com.microservices.BookCatalogService.model.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BookCatalog  {
	private String uname;
	private String email;
	private List<RatingWithBookInfo> booksAndRatings;
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
	public List<RatingWithBookInfo> getBooksAndRatings() {
		return booksAndRatings;
	}
	public void setBooksAndRatings(List<RatingWithBookInfo> booksAndRatings) {
		this.booksAndRatings = booksAndRatings;
	}
	@Override
	public String toString() {
		return "BookCatalog [uname=" + uname + ", email=" + email + ", booksAndRatings=" + booksAndRatings + "]";
	}
	
}
