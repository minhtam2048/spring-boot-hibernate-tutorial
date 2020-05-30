package com.example.springauth.demo.services.Impl;

import com.example.springauth.demo.models.Product;
import com.example.springauth.demo.repository.ProductRepository;
import com.example.springauth.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl (ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> findAllProduct() {
        return (List<Product>) productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Integer id) {
        return productRepository.findById(id);
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public void remove(Product product) {
        productRepository.delete(product);
    }

}
