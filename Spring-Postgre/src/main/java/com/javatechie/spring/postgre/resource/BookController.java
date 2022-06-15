package com.javatechie.spring.postgre.resource;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.spring.postgre.model.Book;
import com.javatechie.spring.postgre.repository.BookRepository;

@RestController
public class BookController {
	
	@Autowired
	private BookRepository bookRepository;
	
	@PostMapping("/addBookP")
	public String saveBook(@RequestBody Book book) {
		bookRepository.save(book);
		return "Agremamos un nuevo dato libro con id : " + book.getId();		
	}
	
	@GetMapping("/findAllBooksP")
	public List<Book>	getBooks(){
		return bookRepository.findAll();
	}
	
	@GetMapping("/findAllBooksP/{id}")
	public Optional<Book> getBook(@PathVariable Long id){
		return bookRepository.findById(id);
	}
	
	@DeleteMapping("/deleteP/{id}")
	public String deleteBook(@PathVariable Long id) {
		bookRepository.deleteById(id);
		return "Se elimino un dato del libro con el id : " + id;
	}
	
	@PutMapping("/updateP/{bookName}")
	public String upgrade(@RequestBody Book bookName) {
		bookRepository.save(bookName);
		return "Se actualiza el nombre del libro : " + bookName.getBookName();
	}
}