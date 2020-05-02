package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.Book;
import com.example.service.BookService;

@RestController
@RequestMapping("book-api")
public class BookController {

	
	@Autowired
	BookService bookService;
	
	public void addBook(Book book)
	{
		
	}
	
	@GetMapping("/books")
	List<Book> getAllBooks()
	{
		return bookService.getAllBooks();
	}
	
	@GetMapping("/books-by-category/{category}")
	List<Book> getBookbycategory(@PathVariable("category")String category)
	{
		return bookService.getBookbycategory(category);
	}
	
	@GetMapping("/books-by-id/{bookid}")
	Book getBookById(@PathVariable("bookid")int bookid)
	{
		return bookService.getBookById(bookid);
	}
	void updateBook(Book book)
	{
		
	}
	
	@GetMapping("/book/{id}")
	void deleteBook(@PathVariable("id")int bookid)
	{
		bookService.deleteBook(bookid);
	}
	
	
}