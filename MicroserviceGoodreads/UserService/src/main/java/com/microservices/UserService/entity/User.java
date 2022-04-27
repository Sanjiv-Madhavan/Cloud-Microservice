package com.microservices.UserService.entity;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(
		name = "user",
		uniqueConstraints = {
				@UniqueConstraint(
				name = "email_unique",
				columnNames = "email"
				),
				@UniqueConstraint(
						name = "uname_unique",
						columnNames = "uname"
						)
		}
		)
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long uid;
	private String uname;
	
	@Column(
			name = "email"
			)
	private String email;
	
	@OneToMany(targetEntity = Ratings.class, cascade = CascadeType.ALL)
	@JoinColumn(name="fk_uid", referencedColumnName = "uid")
	private List<Ratings> ratings = new ArrayList<>();

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
