package com.gl.lbmgmtssn.service;

import java.awt.print.Book;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.lbmgmtssn.entity.Books;
import com.gl.lbmgmtssn.repository.BookRepo;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	BookRepo bookRepo;

	@Override
	public List<Books> findAll() {
		return bookRepo.findAll();
	}

	@Override
	public Books findById(int id) {
		return bookRepo.findById(id).get();
	}

	@Override
	public void save(Books book) {
		bookRepo.save(book);
		
	}

	@Override
	public void deleteById(int id) {
		bookRepo.deleteById(id);
		
	}

	@Override
	public List<Books> searchBy(String name, String author) {
		return bookRepo.findByNameContainsAndAuthorContainsAllIgnoreCase(name, author);
	}

}
