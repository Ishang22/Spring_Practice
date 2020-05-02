package com.example.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.Book;
import com.example.dao.BookDAO;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookDAO bookDAO;
	
	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		bookDAO.addBook(book);
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		//	return null;
		
		List<Book> bookList=bookDAO.getAllBooks();
		
		return bookList
				.stream()
				.sorted((book1,book2)->book1.getAuthor().compareTo(book2.getAuthor()))
				.collect(Collectors.toList());
	}

	@Override
	public List<Book> getBookbycategory(String category) {
		// TODO Auto-generated method stub
		List<Book> bookList=bookDAO.getBookbycategory(category);
		
		return bookList
				.stream()
				.sorted((book1,book2)->book1.getAuthor().compareTo(book2.getAuthor()))
				.collect(Collectors.toList());
	}

	@Override
	public Book getBookById(int bookid) {
		// TODO Auto-generated method stub
		return bookDAO.getBookById(bookid);
	}

	@Override
	public void updateBook(Book book) {
		// TODO Auto-generated method stub
		bookDAO.updateBook(book);
	}

	@Override
	public void deleteBook(int bookid) {
		// TODO Auto-generated method stub
		bookDAO.deleteBook(bookid);
	}
	
	
	
}
