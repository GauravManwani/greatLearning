package com.greatlearning.spring.security.gl.demo.service;

import com.greatlearning.spring.security.gl.demo.entity.Product;
import com.greatlearning.spring.security.gl.demo.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepo productRepo;

    @Override
    public List<Product> getAllProducts() throws Exception {
        throw new Exception("Not Found");
//        return productRepo.findAll();
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
        Optional<Product> productOptional= productRepo.findById(id);
        if(productOptional.isPresent()){
            return productOptional.get();
        }
        return null;
    }

    @Override
    public void deleteProductById(Integer id) {
        productRepo.deleteById(id);
    }
}
