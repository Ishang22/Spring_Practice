package com.example.dao;

import java.util.List;

import com.example.bean.Book;

public interface BookDAO {
	void addBook(Book book);
	List<Book> getAllBooks();
	List<Book> getBookbycategory(String category);
	Book getBookById(int bookid);
	void updateBook(Book book);
	void deleteBook(int bookid);
}
