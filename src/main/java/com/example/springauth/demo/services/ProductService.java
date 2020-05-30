package com.example.springauth.demo.services;

import com.example.springauth.demo.models.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> findAllProduct();
    Optional<Product> findById(Integer id);
    void save(Product product);
    void remove(Product product);
}
