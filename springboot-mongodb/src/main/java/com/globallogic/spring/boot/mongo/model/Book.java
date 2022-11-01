package com.globallogic.spring.boot.mongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Book")
public class Book {

	@Id
	private int id;
	private String bookName;
	private String authorName;
	
	
	private int isbn;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	
	
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book [id=");
		builder.append(id);
		builder.append(", bookName=");
		builder.append(bookName);
		builder.append(", authorName=");
		builder.append(authorName);
		builder.append(", isbn=");
		builder.append(isbn);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	

}
