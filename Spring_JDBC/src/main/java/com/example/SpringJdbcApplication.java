package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.service.BookService;
import com.example.bean.Book;


@SpringBootApplication
public class SpringJdbcApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcApplication.class, args);
	}

	@Autowired
	BookService bookService;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		bookService.getAllBooks().forEach(System.out::println);		
		System.out.println();
		bookService.getBookbycategory("Fiction").forEach(System.out::println);
		System.out.println();
		Book newBook=bookService.getBookById(24);
		System.out.println(newBook);
	}

}
