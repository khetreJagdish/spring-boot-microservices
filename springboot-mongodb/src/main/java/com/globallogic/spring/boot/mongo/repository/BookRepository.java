package com.globallogic.spring.boot.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.globallogic.spring.boot.mongo.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer> {

}
