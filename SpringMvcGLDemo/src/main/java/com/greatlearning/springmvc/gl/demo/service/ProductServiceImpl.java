package com.greatlearning.springmvc.gl.demo.service;

import com.greatlearning.springmvc.gl.demo.controller.ProductController;
import com.greatlearning.springmvc.gl.demo.entity.Product;
import com.greatlearning.springmvc.gl.demo.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepo productRepo;

    @Override
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        return saveProduct(product);
    }

    @Override
    public Product getProductById(Integer id) {
        return productRepo.findById(id).get();
    }

    @Override
    public void deleteProductById(Integer id) {
        productRepo.deleteById(id);
    }
}
