package com.globallogic.spring.boot.mongo.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.spring.boot.mongo.model.Book;
import com.globallogic.spring.boot.mongo.repository.BookRepository;

@RestController
public class BookController {

	@Autowired
	private BookRepository bookRepository;

	@PostMapping("/addBook")
	public String saveBook(@RequestBody Book book) {

		bookRepository.save(book);
		return "Added Book with ID : " + book.getId();
	}

	@GetMapping("/getAllBooks")
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	@GetMapping("/getBookById/{id}")
	public Optional<Book> getBookById(@PathVariable int id) {
		System.out.println("Request for Book ID :"+ id);
		return bookRepository.findById(id);
	}

	@DeleteMapping("/deleteBookById/{id}")
	public String deleteBookById(@PathVariable int id) {

		bookRepository.deleteById(id);
		return "Book deleted with id : " + id;
	}
	
	@PatchMapping("/updateBook/{id}")
	public Boolean updateBookDataById(@PathVariable int id) {
		
		Optional<Book> book = bookRepository.findById(id);
		if(book.isPresent()) {
			Book book1 = book.get();
			book1.setBookName("Atomic Habbits By James Clear");
			book1.setContentType("Personal Development");
			bookRepository.save(book1);
			return true;
		}
		return false;
	}

}
