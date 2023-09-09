package com.greatlearning.spring.jpa.demo.service;

import com.greatlearning.spring.jpa.demo.dao.ProductDao;
import com.greatlearning.spring.jpa.demo.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Component
public class ProductService {

    @Autowired
    ProductDao productDao;

    @Transactional
    public void save(Product product){
        productDao.save(product);
    }
}
