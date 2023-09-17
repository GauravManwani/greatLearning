package com.greatlearning.LibraryMgmtSession.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.LibraryMgmtSession.entity.Book;
import com.greatlearning.LibraryMgmtSession.repositories.BookRepository;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	BookRepository bookRepository;

	@Override
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	@Override
	public Book getBook(int bookId) {
		Optional<Book> bookDetails=bookRepository.findById(bookId);
		
		if(bookDetails.isPresent()) {
			return bookDetails.get();
		}else {
			throw new IllegalArgumentException("Book Id Not Found");
		}
	}

	@Override
	public void saveBookRecord(Book book) {
		bookRepository.save(book);
	}

	@Override
	public void deleteBook(int id) {
		bookRepository.deleteById(id);
	}

}
