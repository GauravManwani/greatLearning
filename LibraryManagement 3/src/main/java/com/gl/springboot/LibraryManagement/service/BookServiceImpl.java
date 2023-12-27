package com.gl.springboot.LibraryManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.springboot.LibraryManagement.entity.Book;
import com.gl.springboot.LibraryManagement.repo.BookRepository;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	BookRepository bookRepository;

	@Override
	public void save(Book book) {
		bookRepository.save(book);
		
	}

	@Override
	public List<Book> findAll() {
		return bookRepository.findAll();
	}

	@Override
	public Book findById(int id) {
		Optional<Book> bookDetails=bookRepository.findById(id);
		if(bookDetails.isPresent()) {
			return bookDetails.get();
		}else {
			throw new RuntimeException("Did not find book id - "+id);
		}
		
	}

	@Override
	public void deleteById(int id) {
		bookRepository.deleteById(id);
		
	}

}
