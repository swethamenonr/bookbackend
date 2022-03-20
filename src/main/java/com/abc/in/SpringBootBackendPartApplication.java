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

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBackendPartApplication.class, args);
	}

	@Autowired
	private BookRepository bookRepository;
	@Override
	public void run(String... args) throws Exception {
		Book book = new Book();
		bookRepository.save(new Book(1, "Wings of Fire","A P J Abdul Kalam, Arun Tiwari", 500));
		bookRepository.save(new Book(2, "The Alchemist","Paulo Coelho", 144));
		bookRepository.save(new Book(3, "War and Peace","Leo Tolstoy", 299));
		bookRepository.save(new Book(3, "Song of Solomon","Tony Morrison", 555));

	}

}
