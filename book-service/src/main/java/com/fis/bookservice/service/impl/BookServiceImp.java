package com.fis.bookservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fis.bookservice.model.Book;
import com.fis.bookservice.repository.BookRepository;
import com.fis.bookservice.service.BookService;

@Service
public class BookServiceImp implements BookService {
	
	@Autowired BookRepository bookRepository;

	@Override
	public List<Book> getBooks() {
		List<Book> books = bookRepository.findAll();
		return books;
	}

}
