package com.abc.in;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.sql.DataSource;
import com.abc.in.model.Book;
import com.abc.in.repository.BookRepository;

@SpringBootApplication
public class SpringBootBackendPartApplication implements CommandLineRunner {
	@Autowired
	private DataSource dataSource;
	@Autowired
	private BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBackendPartApplication.class, args);
	}

	

}
