package com.gl.lbmgmtssn.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Books {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name= "id")
	private int id;
	
	@Column
	private String name;
	
	@Column
	private String category;
	
	@Column
	private String author;
	
	public Books() {
		
	}

	public Books(String name, String category, String author) {
		super();
		this.name = name;
		this.category = category;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Books [name=" + name + ", category=" + category + ", Author=" + author + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	//openApi
	// security
	

}
