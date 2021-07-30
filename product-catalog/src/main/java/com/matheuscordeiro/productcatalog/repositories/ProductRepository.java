package com.matheuscordeiro.productcatalog.repositories;

import com.matheuscordeiro.productcatalog.models.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Integer> {
    List<Product> findByName(String name);
}