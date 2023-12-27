package com.gl.springboot.LibraryManagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.springboot.LibraryManagement.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer >{

}
