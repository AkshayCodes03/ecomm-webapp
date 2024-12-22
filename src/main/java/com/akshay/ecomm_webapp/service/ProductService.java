package com.akshay.ecomm_webapp.service;

import com.akshay.ecomm_webapp.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(new Product(101,"Iphone",100000), new Product(102,"Ipad", 50000));

    public List<Product> getProducts() {
        return products;
    }
}
