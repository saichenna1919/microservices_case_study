package com.fis.bookservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fis.bookservice.model.Book;
import com.fis.bookservice.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired BookService bookService;
	
	@GetMapping("books")
	public List<Book> getBooks() {
		
		return bookService.getBooks();
		
	}

}
