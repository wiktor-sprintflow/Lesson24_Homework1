package com.sprintflow.lesson24_homework.repository;

import com.sprintflow.lesson24_homework.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Repository
public class ProductRepository {
    private List<Product> database;

    public ProductRepository() {
        database = new ArrayList<>();
        Product exampleProduct = new Product("TV Set", 1000);
        database.add(exampleProduct);
    }

    public void add(Product product) {
        database.add(product);
    }
}
