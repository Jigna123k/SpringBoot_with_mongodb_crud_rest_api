package com.javaguide.springboot.mong.api.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaguide.springboot.mong.api.model.Book;
import com.javaguide.springboot.mong.api.repository.BookRepository;

@RestController
public class BookController {
	
	@Autowired
	private BookRepository repository;
	
	@PostMapping("/addBook")
	public String saveBook(@RequestBody Book book) {
		repository.save(book);
		return "Added book with id..."+book.getId();
	
	}
	 
	@GetMapping("/findAllBooks")
	 public List<Book> getBooks(){
		 
		 return repository.findAll();
	 }
	 
	@GetMapping("/findAllBooks/{id}")
	public Optional<Book> getBook(@PathVariable int  id){
		return repository.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable int  id) {
		repository.deleteById(id);
		return "Book deleted with this id.." + id;
		
	}
	}


