package com.greatlearning.spring.security.gl.demo.service;

import com.greatlearning.spring.security.gl.demo.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts() throws Exception;

    Product saveProduct(Product product);

    Product updateProduct(Product product);

    Product getProductById(Integer id);

    void deleteProductById(Integer id);
}
