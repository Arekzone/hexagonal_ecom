package com.example.testowaniehibernate.Product.core;

import com.example.testowaniehibernate.Product.domain.Product;
import com.example.testowaniehibernate.Product.domain.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Optional<Product> findById(Long id){
        return productRepository.findById(id);
    }
    public void addProduct(String string){
        Product product = new Product();
        product.setNazwaProduktu(string);
        productRepository.save(product);
    }
}
