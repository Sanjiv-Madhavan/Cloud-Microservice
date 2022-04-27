package com.microservices.UserService.entity;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ratings")
@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(RatingsID.class)
public class Ratings{
	
	@Id
	private String isbn;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ratingID;
	
	private int ratings;
	
	
	public long getRatingID() {
		return ratingID;
	}
	public void setRatingID(long ratingID) {
		this.ratingID = ratingID;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	
	
//	public long getUid() {
//		return uid;
//	}
//	public void setUid(long uid) {
//		this.uid = uid;
//	}
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
