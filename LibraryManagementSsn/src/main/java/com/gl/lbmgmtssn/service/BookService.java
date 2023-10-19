package com.gl.lbmgmtssn.service;

import java.util.List;

import com.gl.lbmgmtssn.entity.Books;

public interface BookService {
	
	List<Books> findAll();
	
	Books findById(int id);
	
	void save(Books book);
	
	void deleteById(int id);
	
	List<Books> searchBy(String name, String author);
	
	

}
