package com.springboot.api.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.api.book.repository.BookRepository;
import com.springboot.api.model.book.Book;
import com.springboot.api.model.user.User;
import com.springboot.api.user.repository.UserRepository;

@RestController
public class DataSourceRestController {

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private UserRepository userRepository;

	@PostConstruct
	public void addData2DB() {
		userRepository.saveAll(Stream.of(new User(123, "Ramesh"), new User(124, "Sam")).collect(Collectors.toList()));
		bookRepository.saveAll(
				Stream.of(new Book(100, "Spring Boot"), new Book(101, "Microservice")).collect(Collectors.toList()));

	}

	@GetMapping("/getUsers")
	public List<User> getUsers() {
		return userRepository.findAll();
	}

	@GetMapping("/getBooks")
	public List<Book> getBooks() {
		return bookRepository.findAll();
	}
}
