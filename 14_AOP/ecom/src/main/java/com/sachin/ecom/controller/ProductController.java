package com.sachin.ecom.controller;

import com.sachin.ecom.Entity.ErrorResponse;
import com.sachin.ecom.Entity.Product;
import com.sachin.ecom.exceptions.ProductNotFoundException;
import com.sachin.ecom.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.file.ProviderNotFoundException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("product/v1")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/getProductById/{productId}")
    public ResponseEntity<?> getProductById(@PathVariable("productId") Integer productId){
        Product product = productService.findById(productId)
                        .orElseThrow(() -> new ProductNotFoundException("Product not found with id : " + productId));
        return ResponseEntity.ok(product);
    }
    @GetMapping("/getProductByName/{name}")
    public ResponseEntity<?> getProductByName(@PathVariable String name){
        Product product = productService.findByName(name)
                .orElseThrow(() -> new ProductNotFoundException("Product not found with name : " + name));
        return new ResponseEntity<>(product,HttpStatus.OK);
    }

    @PostMapping("/addProduct")
    public ResponseEntity<Product> addProduct(@RequestBody Product product){

        Product createdProduct = productService.addProduct(product);
        System.out.println("addProductController");
        return new ResponseEntity<>(createdProduct, HttpStatus.CREATED);
    }
    @GetMapping("/getAllProducts")
    public ResponseEntity<List<Product>> getAllProducts(){
        List<Product> products =  productService.getAllProducts();
        return ResponseEntity.ok(products);
    }
}

