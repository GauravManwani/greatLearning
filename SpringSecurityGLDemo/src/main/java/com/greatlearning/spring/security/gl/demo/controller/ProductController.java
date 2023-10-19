package com.greatlearning.spring.security.gl.demo.controller;

import com.greatlearning.spring.security.gl.demo.entity.Product;
import com.greatlearning.spring.security.gl.demo.service.LoginService;
import com.greatlearning.spring.security.gl.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductController {

    @Autowired
    ProductService productService;

    @Autowired
    LoginService loginService;

    @RequestMapping(value= "/products")
    public String listProducts(Model model){
//            model.addAttribute("productListDetails", productService.getAllProducts());
            return "products";
    }

    @RequestMapping(value= "/products/new")
    public String openAddProductForm(Model model){
            Product product = new Product();

            model.addAttribute("product", product);
            return "create_products";
    }

    @RequestMapping(value= "/save",method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute("product") Product product){
            productService.saveProduct(product);
            return "redirect:/products";
    }

    @RequestMapping(value= "/forbidden")
    public String forbidden(Model model){
        return "forbidden";
    }
}


//MVC => model view controller

// controller is returning view
// view needs data to show
// set data to view using Models