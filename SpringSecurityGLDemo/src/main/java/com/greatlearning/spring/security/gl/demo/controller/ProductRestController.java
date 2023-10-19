package com.greatlearning.spring.security.gl.demo.controller;

import com.greatlearning.spring.security.gl.demo.entity.Product;
import com.greatlearning.spring.security.gl.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/rest")
public class ProductRestController {

    @Autowired
    ProductService productService;

    @GetMapping("/getList")
    public ResponseEntity<List<Product>> getProductList(@RequestHeader Map<String,String> headers) throws Exception {

        return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);
    }

}

