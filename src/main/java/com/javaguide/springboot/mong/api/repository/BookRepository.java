package com.javaguide.springboot.mong.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.javaguide.springboot.mong.api.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer> {
	
}
