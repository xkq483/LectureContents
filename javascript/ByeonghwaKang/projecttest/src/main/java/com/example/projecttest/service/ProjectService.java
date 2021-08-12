package com.example.projecttest.service;

import com.example.projecttest.entity.Product;

import java.util.List;

public interface ProjectService {
    public void register(Product product);

    public List<Product> list() throws Exception;;

}
