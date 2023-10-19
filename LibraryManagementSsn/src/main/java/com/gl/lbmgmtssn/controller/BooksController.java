package com.gl.lbmgmtssn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gl.lbmgmtssn.service.BookService;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/books")
public class BooksController {

	@Autowired
	BookService bookService;
	
	@RequestMapping(value = "/list",method = RequestMethod.GET)
	public String listBooks(Model model) {
		model.addAttribute("Books",bookService.findAll());
		
		return "list-Books";
	}
}
