package com.greatlearning.LibraryMgmtSession.service;

import java.util.List;

import com.greatlearning.LibraryMgmtSession.entity.Book;

public interface BookService {
	
	public List<Book> getAllBooks();
	
	public Book getBook(int bookId);
	
	public void saveBookRecord(Book book);
	
	public void deleteBook(int id);
	
}
