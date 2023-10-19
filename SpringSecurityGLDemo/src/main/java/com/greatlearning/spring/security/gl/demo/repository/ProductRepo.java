package com.greatlearning.spring.security.gl.demo.repository;

import com.greatlearning.spring.security.gl.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
}
