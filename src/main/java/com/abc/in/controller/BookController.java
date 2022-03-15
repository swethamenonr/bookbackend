package com.abc.in.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.in.model.Book;
import com.abc.in.repository.BookRepository;
@CrossOrigin(origins = "http://localhost:3000/")
@RestController
public class BookController {

    @Autowired
    private BookRepository bookRepository;
    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}