package com.akshay.ecomm_webapp.controller;

import com.akshay.ecomm_webapp.model.Product;
import com.akshay.ecomm_webapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return service.getProducts();
    }

    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId) {
        return service.getProductById(prodId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod) {
        service.addProduct(prod);
    }

}
