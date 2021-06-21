package com.example.productList.service;

import com.example.productList.entity.Product;

import java.util.List;

public interface ProductListService {
    public void register(Product product) throws Exception;

    public List<Product> list() throws Exception;

}
