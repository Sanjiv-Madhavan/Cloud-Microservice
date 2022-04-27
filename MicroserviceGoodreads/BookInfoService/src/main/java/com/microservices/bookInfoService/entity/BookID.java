package com.microservices.bookInfoService.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@EqualsAndHashCode
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookID implements Serializable{
	private long bookID;
	private String isbn;
}
