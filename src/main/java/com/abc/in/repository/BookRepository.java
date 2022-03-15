package com.abc.in.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.in.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{
}