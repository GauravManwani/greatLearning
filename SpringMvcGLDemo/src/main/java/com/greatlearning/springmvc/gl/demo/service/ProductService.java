package com.greatlearning.springmvc.gl.demo.service;

import com.greatlearning.springmvc.gl.demo.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();

    Product saveProduct(Product product);

    Product updateProduct(Product product);

    Product getProductById(Integer id);

    void deleteProductById(Integer id);
}
