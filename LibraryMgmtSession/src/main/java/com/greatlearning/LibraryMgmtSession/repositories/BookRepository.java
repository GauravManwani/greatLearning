package com.greatlearning.LibraryMgmtSession.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.LibraryMgmtSession.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}


//Table => Entity
//Query => DAO(Data Access Object) => Repository 
//Logic => main => Service
//HTTP Method => Controller => @Controller=> html-code(view)
//								@RestController => Response Body
//@RestController = @Controller & @ResponseBody

//HTTP Methods: GET, POST, PUT, DELETE, PATCH
// URL => https://localhost:8080/books/get?id=