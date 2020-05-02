package com.example.bean;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Book {

	String title,author,category;
	int price,bookid;
	public Book(String title, String author, String category, int price, int bookid) {
		super();
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
		this.bookid = bookid;
	}

}
