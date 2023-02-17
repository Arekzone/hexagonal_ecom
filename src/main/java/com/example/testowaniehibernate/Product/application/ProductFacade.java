package com.example.testowaniehibernate.Product.application;

import com.example.testowaniehibernate.Product.core.ProductService;
import com.example.testowaniehibernate.Product.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductFacade {
    @Autowired
    private ProductService productService;

    public void addProduct(String string){
        productService.addProduct(string);
    }
    public Optional<Product> getProduct(Long id){
        return productService.findById(id);
    }

}
