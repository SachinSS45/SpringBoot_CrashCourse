package com.sachin.ecom.service;

import com.sachin.ecom.Entity.Product;
import com.sachin.ecom.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {


    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
        System.out.println("ProductService Created");
    }


    public Product addProduct(Product product){
        System.out.println("Add Product");
        return productRepository.save(product);
    }

    public Optional<Product> findById(Integer id){
        return productRepository.findById(id);
    }
    public Optional<Product> findByName(String name){
        return productRepository.findByName(name);
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public void deleteProduct(Integer id){
        productRepository.deleteById(id);
    }
}
