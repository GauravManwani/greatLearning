package com.greatlearning.spring.jpa.demo.dao;

import com.greatlearning.spring.jpa.demo.entity.Product;

import java.util.List;

public interface ProductDao {
    public void save(Product product);

    public List<Product> findAll();
}
