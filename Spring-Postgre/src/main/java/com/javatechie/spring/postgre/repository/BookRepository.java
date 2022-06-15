package com.javatechie.spring.postgre.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechie.spring.postgre.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
