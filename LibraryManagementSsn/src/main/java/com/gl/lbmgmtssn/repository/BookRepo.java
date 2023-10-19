package com.gl.lbmgmtssn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.lbmgmtssn.entity.Books;

@Repository
public interface BookRepo extends JpaRepository<Books, Integer>{
	
	List<Books> findByNameContainsAndAuthorContainsAllIgnoreCase(String name, String author);

}
