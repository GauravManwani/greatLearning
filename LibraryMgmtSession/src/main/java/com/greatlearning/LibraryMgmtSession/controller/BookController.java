package com.greatlearning.LibraryMgmtSession.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.LibraryMgmtSession.entity.Book;
import com.greatlearning.LibraryMgmtSession.service.BookService;

//@RestController
@Controller
@RequestMapping("/books")
public class BookController {
	
	@Autowired
	BookService bookService;
	
	//APIs with Response Body
//	@GetMapping("/list")
//	public List<Book> listBooks(){
//		return bookService.getAllBooks();
//	}
//	
//	@PostMapping("/save")
//	public void saveBook(@RequestBody Book book){
//		bookService.saveBookRecord(book);
//	}
//	
//	@GetMapping("/get")
//	public Book getBook(@RequestParam int id){
//		return bookService.getBook(id);
//	}
//	
//	@DeleteMapping("/delete")
//	public void delete(@RequestParam int id){
//		 bookService.deleteBook(id);
//	}
	
	
	@GetMapping("/list")
	public String listBooks(Model theModel) {
		
		// get books from database
		List<Book> theBooks = bookService.getAllBooks();
		
		// add to the spring model
		theModel.addAttribute("books", theBooks);
		
		return "books/list-books";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Book theBook = new Book();
		
		theModel.addAttribute("book", theBook);
		
		return "books/book-form";
	}

	@PostMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("bookId") int theId,
									Model theModel) {
		
		// get the book from the service
		Book theBook = bookService.getBook(theId);
		
		// set book as a model attribute to pre-populate the form
		theModel.addAttribute("book", theBook);
		
		// send over to our form
		return "books/book-form";			
	}
	
	
	@PostMapping("/save")
	public String saveBook(@ModelAttribute("book") Book theBook) {
		
		// save the book
		bookService.saveBookRecord(theBook);
		
		// use a redirect to prevent duplicate submissions
		return "redirect:/books/list";
	}
	
	
	@PostMapping("/delete")
	public String delete(@RequestParam("bookId") int theId) {
		
		// delete the book
		bookService.deleteBook(theId);
		
		// redirect to /books/list
		return "redirect:/books/list";
		
	}
}
