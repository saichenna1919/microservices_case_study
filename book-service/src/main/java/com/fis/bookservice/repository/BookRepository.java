package com.fis.bookservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fis.bookservice.model.Book;


public interface BookRepository extends JpaRepository<Book, Integer>{
	

}
