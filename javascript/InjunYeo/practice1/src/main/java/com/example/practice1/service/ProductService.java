package com.example.practice1.service;

import com.example.practice1.entity.Product;

import java.util.List;

public interface ProductService {

    public void register(Product product) throws Exception;
    public List<Product> list() throws Exception;
}
