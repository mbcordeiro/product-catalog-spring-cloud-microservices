package com.matheuscordeiro.productcatalog.controllers;

import com.matheuscordeiro.productcatalog.models.Product;
import com.matheuscordeiro.productcatalog.repositories.ProductRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@RestController
@RequestMapping(value = "/products")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(method = RequestMethod.POST)
    public Product create(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @RequestMapping
    public Iterable<Product> list() {
        return productRepository.findAll();
    }

    @RequestMapping(value = "/{id}")
    public Optional<Product> findById(@PathVariable("id") Integer id) {
        return productRepository.findById(id);
    }

    @RequestMapping(value = "/name/{name}")
    public Iterable<Product> findByName(@PathVariable("name") String name) {
        return productRepository.findByName(name);
    }
}